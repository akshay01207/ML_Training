package com.bhavna.service;

import java.util.List;

import com.bhavna.entity.Order01;

public interface OrderService {

	public void addOrder(Order01 order);

	public List<Order01> getAllOrders();

	public List<Order01> getOrderByCategory(String category);

	public void removeByCategory(String category);

	public void updateByCategory(Order01 order, String category);

	public void updateByPatch(Order01 order, String categoryName) throws Exception;

}
