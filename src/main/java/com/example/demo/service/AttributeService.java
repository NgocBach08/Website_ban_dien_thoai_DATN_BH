package com.example.demo.service;

import com.example.demo.dto.respone.attribute.AttributeRespone;

/**
 * Description:
 *
 * @author: hieu
 * @since: 17/07/2022
 * Project_name: com.example.demo.service
 */
public interface AttributeService {
    AttributeRespone findByProduct(Long id);
}
