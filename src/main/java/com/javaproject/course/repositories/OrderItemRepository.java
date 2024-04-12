package com.javaproject.course.repositories;

import com.javaproject.course.entities.OrderItem;
import com.javaproject.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
