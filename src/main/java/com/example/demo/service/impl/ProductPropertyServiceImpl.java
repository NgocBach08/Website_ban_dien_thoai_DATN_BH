package com.example.demo.service.impl;

import com.example.demo.dto.respone.product.ProductPropertyRespone;
import com.example.demo.entity.ProductPropertyEntity;
import com.example.demo.repo.ProductPropertyRepo;
import com.example.demo.service.ColorService;
import com.example.demo.service.ProductPropertyService;
import com.example.demo.util.ConvertUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductPropertyServiceImpl implements ProductPropertyService {

    private final ProductPropertyRepo repo;
    private final ConvertUtil util;

    private final ColorService colorService;

    @Override
    public List<ProductPropertyRespone> findByRomId(Long romId) {
        List<ProductPropertyEntity> entityList = repo.findByRomId(romId);
        List<ProductPropertyRespone> responeList = new ArrayList<>();
        entityList.forEach(o -> {
            responeList.add(ProductPropertyRespone.builder()
                    .price(o.getPrice())
                    .priceNow(util.moneyToStringFormat(o.getPricePromotion()*o.getPrice()/100))
                    .priceString(util.moneyToStringFormat(o.getPrice()))
                    .quantity(o.getQuantity())
                    .id(String.valueOf(o.getId()))
                    .color(colorService.findById(o.getColorId()))
                    .pricePromotion(o.getPricePromotion())
                    .pricePromotionString(util.moneyToStringFormat(o.getPricePromotion()))
                    .idPromotion(o.getPromotionId())
                    .build());
        });
        return responeList;
    }
}
