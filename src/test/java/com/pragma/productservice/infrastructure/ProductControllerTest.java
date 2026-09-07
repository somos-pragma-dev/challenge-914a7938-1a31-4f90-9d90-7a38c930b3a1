package com.pragma.productservice.infrastructure;

import com.pragma.productservice.application.ProductService;
import com.pragma.productservice.infrastructure.ProductDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProductControllerTest {

    @Mock
    private ProductService productService;

    @InjectMocks
    private ProductController productController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void createProduct_success() {
        ProductDTO productDTO = new ProductDTO("Product 1", 10.0, 100, "Category 1");
        when(productService.createProduct(productDTO)).thenReturn(productDTO);
        ResponseEntity<ProductDTO> response = productController.createProduct(productDTO);
        assertEquals(200, response.getStatusCodeValue());
        assertEquals(productDTO, response.getBody());
    }

    @Test
    void getProductById_success() {
        Long id = 1L;
        ProductDTO productDTO = new ProductDTO("Product 1", 10.0, 100, "Category 1");
        when(productService.getProductById(id)).thenReturn(productDTO);
        ResponseEntity<ProductDTO> response = productController.getProductById(id);
        assertEquals(200, response.getStatusCodeValue());
        assertEquals(productDTO, response.getBody());
    }

    @Test
    void updateProduct_success() {
        Long id = 1L;
        ProductDTO productDTO = new ProductDTO("Product 1", 10.0, 100, "Category 1");
        when(productService.updateProduct(id, productDTO)).thenReturn(productDTO);
        ResponseEntity<ProductDTO> response = productController.updateProduct(id, productDTO);
        assertEquals(200, response.getStatusCodeValue());
        assertEquals(productDTO, response.getBody());
    }

    @Test
    void deleteProduct_success() {
        Long id = 1L;
        doNothing().when(productService).deleteProduct(id);
        ResponseEntity<Void> response = productController.deleteProduct(id);
        assertEquals(200, response.getStatusCodeValue());
    }
}