package com.example.demo.dto.respone.voucher;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description:
 *
 * @author: hieu
 * @since: 07/08/2022
 * Project_name: com.example.demo.dto.respone.voucher
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VoucherRespone {
    private String type;
    private String discount;
    private String quantity;
    private String accompanyPromo;
    private int minAmount;
    private Long typeDiscountMoneyMin;
}
