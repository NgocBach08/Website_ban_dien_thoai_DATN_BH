package com.example.demo.dto.request.orders;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description:
 *
 * @author: hieu
 * @since: 12/08/2022
 * Project_name: com.example.demo.dto.request.orders
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdersRequest {
    private Long id;
    private String address;
    private Long totalMoney;
    private String voucherCode;
    private String status;
    private String note;
    private String statusBy;
}
