package com.example.demo.api;

import com.example.demo.repo.ProductRepo;
import com.example.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")
public class ProductApi {
    private  final ProductService productService;
    private  final ProductRepo productRepo;

}
