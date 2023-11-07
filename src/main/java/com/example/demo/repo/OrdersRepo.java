package com.example.demo.repo;

import com.example.demo.entity.CustomerEntity;
import com.example.demo.entity.OrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Description:
 *
 * @author: hieu
 * @since: 12/08/2022
 * Project_name: com.example.demo.repo
 */
@Repository
public interface OrdersRepo extends JpaRepository<OrdersEntity, Long> {
    @Query("select o from OrdersEntity o where o.status <> '-2' order by o.createDate desc")
    List<OrdersEntity> findByCustomerEntityOrderByCreateDateDesc(CustomerEntity entity);

    OrdersEntity findByCodeOrder(String code);
}
