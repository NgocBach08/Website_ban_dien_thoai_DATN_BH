package com.example.demo.service;

import com.example.demo.dto.request.orders.OrdersRequest;
import com.example.demo.dto.respone.VPResponDto;
import com.example.demo.dto.respone.cart.CartRespone;
import com.example.demo.dto.respone.order.OrderRespone;
import com.example.demo.entity.OrdersEntity;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Description:
 *
 * @author: hieu
 * @since: 13/08/2022
 * Project_name: com.example.demo.service
 */
public interface OrderService {

    String createOrder(OrdersRequest request);

    VPResponDto createOrderOnline (OrdersRequest request , HttpServletRequest requesthttp);

    String updateOrder(OrdersRequest request);

    String deleteOrder(long id);

    List<OrderRespone> findAllOrder();

    List<CartRespone> findByOrderDetail(String id);

    OrdersEntity findByOrder(String id);

    String canncelOrder(String id);

    String datLai(String id);


}
