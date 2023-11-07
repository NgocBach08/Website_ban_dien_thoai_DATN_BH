package com.example.demo.service;

import com.example.demo.dto.request.customer.CustomerRequest;
import com.example.demo.entity.CustomerEntity;

import java.text.ParseException;

/**
 * Description:
 *
 * @author: hieu
 * @since: 19/07/2022
 * Project_name: com.example.demo.service
 */
public interface CustomerService {
    CustomerEntity findByEmail(String email);

    String addCustomer(CustomerRequest request) throws ParseException;

    CustomerEntity findByPhone(String phone);
}
