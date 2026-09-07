package com.pragma.productservice.application;

import com.pragma.productservice.domain.Product;
import com.pragma.productservice.infrastructure.ProductDTO;

public interface ProductService {
    ProductDTO createProduct(ProductDTO productDTO);
    ProductDTO getProductById(Long id);
    ProductDTO updateProduct(Long id, ProductDTO productDTO);
    void deleteProduct(Long id);
}