package com.pragma.productservice.application;

import com.pragma.productservice.domain.Product;
import com.pragma.productservice.infrastructure.ProductDTO;
import com.pragma.productservice.infrastructure.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) {
        if (productDTO.getPrice() < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        if (productRepository.existsByName(productDTO.getName())) {
            throw new IllegalArgumentException("El nombre del producto ya existe");
        }
        Product product = new Product(productDTO.getName(), productDTO.getPrice(), productDTO.getStock(), productDTO.getCategory());
        productRepository.save(product);
        return new ProductDTO(product);
    }

    @Override
    public ProductDTO getProductById(Long id) {
        return productRepository.findById(id)
               .map(ProductDTO::new)
               .orElseThrow(() -> new IllegalArgumentException("Producto no encontrado"));
    }

    @Override
    public ProductDTO updateProduct(Long id, ProductDTO productDTO) {
        if (productDTO.getPrice() < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        if (productRepository.existsByNameAndIdNot(productDTO.getName(), id)) {
            throw new IllegalArgumentException("El nombre del producto ya existe");
        }
        Product product = productRepository.findById(id)
               .orElseThrow(() -> new IllegalArgumentException("Producto no encontrado"));
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setStock(productDTO.getStock());
        product.setCategory(productDTO.getCategory());
        productRepository.save(product);
        return new ProductDTO(product);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}