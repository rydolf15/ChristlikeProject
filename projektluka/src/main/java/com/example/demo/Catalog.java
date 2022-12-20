package com.example.demo;

import java.util.stream.Stream;

public interface Catalog {
    Stream<Product> getAll();
}
