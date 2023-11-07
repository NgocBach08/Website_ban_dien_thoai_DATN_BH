package com.example.demo.dto.respone.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description:
 *
 * @author: hieu
 * @since: 19/09/2022
 * Project_name: com.example.demo.dto.respone.order
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRespone {
    private String id;
    private String codeOrder;
    private String createDate;
    private String status;
    private String totalString;

}
