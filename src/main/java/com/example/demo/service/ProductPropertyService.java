package com.example.demo.service;

import com.example.demo.dto.respone.product.ProductPropertyRespone;

import java.util.List;

public interface ProductPropertyService {

    List<ProductPropertyRespone> findByRomId(Long romId);
}
