package com.example.demo.dto.request.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description:
 *
 * @author: hieu
 * @since: 24/07/2022
 * Project_name: com.example.demo.dto.request.customer
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRequest {
    private String name;
    private String phone;
    private String email;
    private String date;
    private String password;
}
