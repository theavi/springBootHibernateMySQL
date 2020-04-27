/**
 * 
 */
package com.avish.cleaningservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avish.cleaningservice.dto.OrderDto;
import com.avish.cleaningservice.model.Order;
import com.avish.cleaningservice.service.OrderService;

/**
 * @author Avinash
 *
 */
@RestController
@RequestMapping(value = "orders")
public class OrderResource {
	@Autowired
	private OrderService orderService;

	@PostMapping
	public Order createOrder(@RequestBody OrderDto orderDto) {
		return orderService.createOrder(orderDto);
	}

	@PutMapping
	public Order modifyOrder(@RequestBody OrderDto orderDto) {
		return orderService.modifyOrder(orderDto);

	}

	@GetMapping(value = "/{orderId}")
	public Order findOrderById(@PathVariable("orderId") Integer orderId) {
		return orderService.findOrderById(orderId);
	}

	@DeleteMapping(value = "/{orderId}")
	public Order removeOrderById(@PathVariable("orderId") Integer orderId) {
		return orderService.removeOrder(orderId);
	}

	@GetMapping
	public List<Order> findAllOrder() {
		return orderService.findAllOrders();
	}

	@GetMapping(value = "/{orderType}")
	public List<Order> findOrderByOrderType(@PathVariable("orderType") Integer orderType) {
		return orderService.findOrderByOrderType(orderType);
	}

	@GetMapping(value = "/{userId}")
	public List<Order> findOrderByUser(@PathVariable("userId") Integer userId) {
		return orderService.findOrderByUser(userId);
	}
}
