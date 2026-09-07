package com.pragma.productservice.application;

import com.pragma.productservice.domain.Product;
import com.pragma.productservice.infrastructure.ProductDTO;
import com.pragma.productservice.infrastructure.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProductServiceImplTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductServiceImpl productService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void createProduct_success() {
        ProductDTO productDTO = new ProductDTO("Product 1", 10.0, 100, "Category 1");
        when(productRepository.save(any(Product.class))).thenReturn(new Product(productDTO.getName(), productDTO.getPrice(), productDTO.getStock(), productDTO.getCategory()));
        ProductDTO result = productService.createProduct(productDTO);
        assertNotNull(result);
        assertEquals(productDTO.getName(), result.getName());
    }

    @Test
    void createProduct_negativePrice_throwsException() {
        ProductDTO productDTO = new ProductDTO("Product 1", -10.0, 100, "Category 1");
        assertThrows(IllegalArgumentException.class, () -> productService.createProduct(productDTO));
    }

    @Test
    void getProductById_success() {
        Long id = 1L;
        Product product = new Product("Product 1", 10.0, 100, "Category 1");
        when(productRepository.findById(id)).thenReturn(Optional.of(product));
        ProductDTO result = productService.getProductById(id);
        assertNotNull(result);
        assertEquals(product.getName(), result.getName());
    }

    @Test
    void getProductById_notFound_throwsException() {
        Long id = 1L;
        when(productRepository.findById(id)).thenReturn(Optional.empty());
        assertThrows(IllegalArgumentException.class, () -> productService.getProductById(id));
    }

    @Test
    void updateProduct_success() {
        Long id = 1L;
        ProductDTO productDTO = new ProductDTO("Product 1", 10.0, 100, "Category 1");
        Product product = new Product(productDTO.getName(), productDTO.getPrice(), productDTO.getStock(), productDTO.getCategory());
        when(productRepository.findById(id)).thenReturn(Optional.of(product));
        when(productRepository.save(any(Product.class))).thenReturn(product);
        ProductDTO result = productService.updateProduct(id, productDTO);
        assertNotNull(result);
        assertEquals(productDTO.getName(), result.getName());
    }

    @Test
    void updateProduct_negativePrice_throwsException() {
        Long id = 1L;
        ProductDTO productDTO = new ProductDTO("Product 1", -10.0, 100, "Category 1");
        assertThrows(IllegalArgumentException.class, () -> productService.updateProduct(id, productDTO));
    }

    @Test
    void deleteProduct_success() {
        Long id = 1L;
        doNothing().when(productRepository).deleteById(id);
        productService.deleteProduct(id);
        verify(productRepository, times(1)).deleteById(id);
    }
}