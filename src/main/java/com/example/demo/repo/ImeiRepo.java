package com.example.demo.repo;


import com.example.demo.entity.ImeiEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Description:
 *
 * @author: hieu
 * @since: 22/10/2022
 * Project_name: com.example.world_phone.repo
 */
@Repository
public interface ImeiRepo extends JpaRepository<ImeiEntity, Long> {
    @Query("select count(o) from ImeiEntity o where o.deleteFlag = false and o.propertyProductId = ?1 and o.status = '0'")
    Long countByPropertyProductId(Long id); // count chua ban

    @Query("select o from ImeiEntity o where o.deleteFlag = false and o.propertyProductId = ?1 and o.status = '0'")
    List<ImeiEntity> findByDeleteFlagIsFalseAndPropertyProductId(Long productId);

    List<ImeiEntity> findByDeleteFlagIsFalseAndPropertyProductIdAndOrderDetailId(Long id, Long idOrder);


    @Query("select o from ImeiEntity o where o.deleteFlag = false and o.orderDetailId = ?1 and o.status = '2'")
    List<ImeiEntity> findByOrder(Long productId);


    @Query("select o from ImeiEntity o where o.deleteFlag = false and o.propertyProductId = ?1 and o.orderDetailId = ?2")
    List<ImeiEntity> findImeiDaBan(Long productId, Long idOrder);


    @Query("select o from ImeiEntity o where o.deleteFlag = false and o.id = ?1")
    ImeiEntity findByIdAndDeleteFlagIsFalse(Long id);
}
