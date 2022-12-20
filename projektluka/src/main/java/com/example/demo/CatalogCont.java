package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/")
public class CatalogCont {

    final Catalog catalog;

    public CatalogCont(Catalog catalog) {
        this.catalog = catalog;
    }

    @GetMapping
    ModelAndView index(){
        return new ModelAndView("index", Map.of("items",this.catalog.getAll()));
    }
}
