package com.fukkatsumi.tacocloud.repository;

import com.fukkatsumi.tacocloud.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {

//    List<Order> findByDeliveryZip(String deliveryZip);
//
//    List<Order> readOrdersByDeliveryZipAndPlacedAtBetween(
//            String deliveryZip, Date startDate, Date endDate);

}