package com.computacenter.cachepoc.service;

import com.computacenter.cachepoc.model.Order;
import com.computacenter.cachepoc.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    @Cacheable(value = "order", key = "#id")
    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    @CachePut(value = "order", key = "#order.id")
    public Order updateOrder(Order order) {
        return orderRepository.save(order);
    }

    @CacheEvict(value = "order", key = "#id")
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }


}
