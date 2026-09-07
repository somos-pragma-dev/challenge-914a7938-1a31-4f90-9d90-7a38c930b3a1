package com.pragma.productservice.infrastructure;

import com.pragma.productservice.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    @Override
    public Optional<Product> findByName(String name) {
        // Implementación del método
        return Optional.empty();
    }

    @Override
    public boolean existsByName(String name) {
        // Implementación del método
        return false;
    }

    @Override
    public boolean existsByNameAndIdNot(String name, Long id) {
        // Implementación del método
        return false;
    }
}