package com.example.demo.dto.respone.attribute;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description:
 *
 * @author: hieu
 * @since: 16/07/2022
 * Project_name: com.example.demo.dto.respone.attribute
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttributeRespone {
    private String operatingSystem; // he dieu hanh

    private String screen; // man hinh

    private String chip;

    private String camTruoc;
    private String camSau;

    private String pin;

    private String ram;
}
