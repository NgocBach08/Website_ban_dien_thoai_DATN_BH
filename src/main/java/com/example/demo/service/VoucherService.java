package com.example.demo.service;

import com.example.demo.dto.respone.voucher.VoucherRespone;

/**
 * Description:
 *
 * @author: hieu
 * @since: 07/08/2022
 * Project_name: com.example.demo.service
 */
public interface VoucherService {
    VoucherRespone findByCode(String code);
}
