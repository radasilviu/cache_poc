package com.computacenter.cachepoc.repository;

import com.computacenter.cachepoc.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends MongoRepository<Order, Long> {
}
