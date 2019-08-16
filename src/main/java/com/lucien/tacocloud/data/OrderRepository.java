package com.lucien.tacocloud.data;

import com.lucien.tacocloud.Order;

public interface OrderRepository {

    Order save(Order order);
}
