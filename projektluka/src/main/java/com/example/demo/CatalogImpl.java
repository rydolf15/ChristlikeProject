package com.example.demo;


import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class CatalogImpl implements Catalog {

    private final CatalogRepository catalogRepository;

    public CatalogImpl(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }


    @Override
    public Stream<Product> getAll() {
        return (Stream<Product>) this.catalogRepository.findAll();
    }
}
