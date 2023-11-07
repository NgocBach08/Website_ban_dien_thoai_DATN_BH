package com.example.demo.dto.respone.cart;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description:
 *
 * @author: hieu
 * @since: 18/07/2022
 * Project_name: com.example.demo.dto.respone.cart
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartRespone {

    private String id;
    private String nameProduct;
    private String idProduct;
    private long priceProduct;
    private String priceProductString;
    private Long quantity;
    private Long quantityProduct;
    private String color;
    private String rom;
    private String imgProduct;
    private long total;
    private String totalString;
    private long priceProductPromotion;
    private String priceProductPromotionString;
}
