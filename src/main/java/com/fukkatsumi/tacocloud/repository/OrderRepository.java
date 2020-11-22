package com.fukkatsumi.tacocloud.repository;

import com.fukkatsumi.tacocloud.entity.Order;

public interface OrderRepository {

    Order save(Order order);

}