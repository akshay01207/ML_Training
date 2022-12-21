package com.bhavna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhavna.entity.Order01;

public interface OrderRepository extends JpaRepository<Order01, Integer> {
	
	Order01 findByOrderCategory(String category);
}
