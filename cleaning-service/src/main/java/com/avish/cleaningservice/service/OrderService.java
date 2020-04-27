package com.avish.cleaningservice.service;

import java.util.List;

import com.avish.cleaningservice.dto.OrderDto;
import com.avish.cleaningservice.model.Order;

/**
 * 
 * @author Avinash
 *
 */
public interface OrderService {
	/**
	 * @param order
	 * @return created order
	 */
	public Order createOrder(OrderDto orderDto);

	/**
	 * @param order
	 * @return
	 */
	public Order modifyOrder(OrderDto orderDto);

	/**
	 * @param orderId
	 * @return requested order
	 */
	public Order findOrderById(Integer orderId);

	/**
	 * @param order
	 * @return deleted order
	 */
	public Order removeOrder(Integer order);

	/**
	 * @return all orders
	 */
	public List<Order> findAllOrders();

	/**
	 * @param orderId
	 * @return Order list by order by order type
	 */
	public List<Order> findOrderByOrderType(Integer orderId);
	
	/**
	 * @param userId
	 * @return
	 */
	public List<Order> findOrderByUser(Integer userId);
}
