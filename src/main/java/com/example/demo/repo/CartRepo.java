package com.example.demo.repo;

import com.example.demo.entity.CartEntity;
import com.example.demo.entity.ProductPropertyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Description:
 *
 * @author: hieu
 * @since: 18/07/2022
 * Project_name: com.example.demo.repo
 */

@Repository
public interface CartRepo extends JpaRepository<CartEntity, Long> {
    List<CartEntity> findByDeleteFlagIsFalseAndIdCustomer(Long id);

    CartEntity findByDeleteFlagIsFalseAndIdCustomerAndIdProduct(Long id, ProductPropertyEntity propertyEntity);

    CartEntity findByDeleteFlagIsFalseAndId(Long id);
}
