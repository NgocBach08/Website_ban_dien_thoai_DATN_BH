package com.example.demo.service;

import com.example.demo.dto.respone.product.NewProductRespone;
import com.example.demo.dto.respone.product.ProductRespone;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {

    List<NewProductRespone> findAll(Pageable pageable);

    ProductRespone findById(Long id);

    List<NewProductRespone> findByCateId(Long id);

    List<NewProductRespone> findByIphone();

    List<NewProductRespone> findBySamSung();

    List<NewProductRespone> findByXiaomi();

    List<NewProductRespone> findByOppo();

    List<NewProductRespone> findByNokia();

    List<NewProductRespone> findbyTop10();

    List<NewProductRespone> findByName(String name);

    List<NewProductRespone> findbyRandom();

    public List<NewProductRespone> getName(String name);
}
