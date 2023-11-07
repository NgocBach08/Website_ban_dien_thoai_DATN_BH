package com.example.demo.api;

import com.example.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/categori")
public class CategoriApi {
    private  final ProductService productService;
//
//
//    @GetMapping("{categoriId}")
//    public List<NewProductRespone> getProductByCategori(@PathVariable("categoriId") Long id){
//        List<NewProductRespone> respone =  productService.findByCateId(id) ;
//        return  respone;
//    }
}
