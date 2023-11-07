package com.example.demo.dto.request.cart;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description:
 *
 * @author: hieu
 * @since: 23/07/2022
 * Project_name: com.example.demo.dto.request.cart
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartEditRequest {
    private String id;
    private String quantity;
}
