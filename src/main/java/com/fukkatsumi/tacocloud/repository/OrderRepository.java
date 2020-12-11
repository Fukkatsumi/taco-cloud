package com.fukkatsumi.tacocloud.repository;

import com.fukkatsumi.tacocloud.entity.Order;
import com.fukkatsumi.tacocloud.entity.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {
    List<Order> findByUserOrderByPlacedAtDesc(User user, Pageable pageable);

//    List<Order> findByDeliveryZip(String deliveryZip);
//
//    List<Order> readOrdersByDeliveryZipAndPlacedAtBetween(
//            String deliveryZip, Date startDate, Date endDate);

}