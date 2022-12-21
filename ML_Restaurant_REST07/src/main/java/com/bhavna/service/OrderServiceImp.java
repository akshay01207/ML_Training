package com.bhavna.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhavna.entity.Order01;
import com.bhavna.repository.OrderRepository;

@Service
public class OrderServiceImp implements OrderService {
	
	@Autowired
	OrderRepository orderRepository;

	@Override
	public void addOrder(Order01 order) {
		orderRepository.save(order);
	}

	@Override
	public List<Order01> getAllOrders() {
		return orderRepository.findAll();
	}

	@Override
	public List<Order01> getOrderByCategory(String category) {
		return orderRepository.findAll().stream().filter(s -> s.getOrderCategory().contentEquals(category))
				.collect(Collectors.toList());
	}

//	@Override
//	public void removeByCategory(String category) {
//		orderRepository.findAll().stream().forEach((s) -> {
//			if (s.getOrderCategory().contentEquals(category)) {
//				orderRepository.deleteById(s.getOrderCategory());
//			}
//		});
//	}

	@Override
	public void updateByCategory(Order01 order, String category) {
		orderRepository.findAll().stream().forEach((s) -> {
			if (s.getOrderCategory().contentEquals(category)) {
				orderRepository.save(order);

			}
		});
	}

	@Override
	public void updateByPatch(Order01 order, String categoryName) throws Exception {
		orderRepository.findAll().stream().forEach((s) -> {
			if (s.getOrderCategory().contentEquals(categoryName)) {
				orderRepository.save(order);
			}
		});

	}

	@Override
	public void removeByCategory(String category) {
		// TODO Auto-generated method stub
		
	}
}
