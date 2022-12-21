package com.bhavna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bhavna.entity.Order01;
import com.bhavna.exception.ResourceNotFoundException;
import com.bhavna.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	OrderService orderService;

	@GetMapping("/home")
	public String welcome() {
		return "Welcome to the home page of REST services";
	}

	@PostMapping("/placeOrder")
	public void placeOrder(@RequestBody Order01 order) {
		orderService.addOrder(order);
	}

	@GetMapping("/getAllOrders")
	public List<Order01> getAllOrders() {
		return orderService.getAllOrders();
	}

	@GetMapping("/getByCategory/{orderCategory}")
	public List<Order01> getByCategory(@PathVariable String orderCategory) {
		return orderService.getOrderByCategory(orderCategory);
	}

	@PutMapping("/updateOrder/{categoryName}")
	public void updateOrder(@PathVariable String categoryName, @RequestBody Order01 order) {
		orderService.updateByCategory(order, categoryName);
	}

//	@PatchMapping("/updateOrder/{categoryName}")
//	public ResponseEntity<String> updateByPatch(@RequestBody Order order, @PathVariable String categoryName) throws Exception {
//		orderService.updateByPatch(order, categoryName);
//		// Orders.save(order, categoryName);
//		return ResponseEntity.ok("resource  updated");
//	}

	@DeleteMapping("/deleteByOrderCategory/{category}")
	public void deleteByCategory(@PathVariable String category) throws ResourceNotFoundException {
		orderService.removeByCategory(category);

	}
}
