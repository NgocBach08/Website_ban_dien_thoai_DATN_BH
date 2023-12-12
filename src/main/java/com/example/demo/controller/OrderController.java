package com.example.demo.controller;

import com.example.demo.dto.respone.cart.CartRespone;
import com.example.demo.entity.CartEntity;
import com.example.demo.entity.CustomerEntity;
import com.example.demo.entity.OrdersEntity;
import com.example.demo.entity.VoucherEntity;
import com.example.demo.repo.CartRepo;
import com.example.demo.repo.OrdersRepo;
import com.example.demo.repo.VoucherRepo;
import com.example.demo.service.CartService;
import com.example.demo.service.CustomerService;
import com.example.demo.util.ConvertUtil;
import com.example.demo.util.SessionUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

/**
 * Description:
 *
 * @author: hieu
 * @since: 24/07/2022
 * Project_name: com.example.demo.controller
 */

@Controller
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {

    private final CartService cartService;

    private final ConvertUtil convertUtil;

    private final SessionUtil sessionUtil;

    private final CustomerService customerService;
    private final OrdersRepo ordersRepo;
    private final CartRepo cartRepo;
    private final VoucherRepo voucherRepo;
    @GetMapping("success")
    public String success(HttpServletRequest request){
        System.out.println(request.getContextPath());
        System.out.println(request.getRequestURI());
        System.out.println(request.getRequestURL());
        if(request.getParameter("vnp_ResponseCode").equals("00")){
            String id = request.getParameter("vnp_OrderInfo");
            Optional<OrdersEntity> o = ordersRepo.findById(Long.valueOf(id));
            o.get().setStatus("0");
            if (o.get().getCustomerEntity() != null && o.get().getCustomerEntity().getId() != null) {
                List<CartEntity> list = cartRepo.findByDeleteFlagIsFalseAndIdCustomer(o.get().getCustomerEntity().getId());
                if (list != null && !list.isEmpty()) {
                    cartRepo.deleteAll(list);
                }
            }
            if(o.get().getVoucherEntity() != null){
                VoucherEntity voucherEntity = o.get().getVoucherEntity();
                voucherEntity.setQuantity(voucherEntity.getQuantity() - 1);
                voucherRepo.save(voucherEntity);
            }
            ordersRepo.save(o.get());
        }
        return "redirect:/home/index";
    }

    @GetMapping("")
    public String index(Model model){
        List<CartRespone> list = cartService.findByCustomer();

        CustomerEntity customerEntity = customerService.findByEmail(String.valueOf(sessionUtil.getObject("username")));

        long tong = 0;
        boolean check = true;
        for (CartRespone cart: list
        ) {
            tong+=cart.getTotal();
            if(cart.getPriceProductPromotion() > 0){
                check = false;
            }
        }
        model.addAttribute("promotion", check ? 1 : 0);
        model.addAttribute("listCart", list);
        model.addAttribute("tong", convertUtil.moneyToStringFormat(tong));
        model.addAttribute("tongOrder", convertUtil.moneyToStringFormat(tong + 30000));
        model.addAttribute("tongPrice", tong);
        model.addAttribute("cutomer", customerEntity);
        return "views/checkout/checkout";
    }
}
