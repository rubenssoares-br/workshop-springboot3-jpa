package com.javaproject.course.repositories;

import com.javaproject.course.entities.Order;
import com.javaproject.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
