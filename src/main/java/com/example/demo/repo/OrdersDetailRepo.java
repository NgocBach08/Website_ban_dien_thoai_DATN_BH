package com.example.demo.repo;

import com.example.demo.entity.OrdersDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Description:
 *
 * @author: hieu
 * @since: 13/08/2022
 * Project_name: com.example.demo.repo
 */
@Repository
public interface OrdersDetailRepo extends JpaRepository<OrdersDetailEntity, Long> {
    @Query("select o from OrdersDetailEntity o where o.deleteFlag = false and o.ordersEntity.id = ?1")
    List<OrdersDetailEntity> findByDeleteFlagIsFalseAndOrdersEntity(Long id);
}
