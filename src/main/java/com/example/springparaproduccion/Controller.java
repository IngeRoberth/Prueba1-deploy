package com.example.springparaproduccion;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    @GetMapping("/hello")
    public String hello() {
        return "<h1>Hello World</h1>";
    }
}
