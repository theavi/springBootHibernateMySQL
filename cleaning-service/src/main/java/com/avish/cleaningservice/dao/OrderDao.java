/**
 * 
 */
package com.avish.cleaningservice.dao;

import java.util.List;

import com.avish.cleaningservice.model.Order;

/**
 * @author Avinash
 *
 */
public interface OrderDao {
	/**
	 * @param order
	 * @return created order
	 */
	public Order createOrder(Order order);

	/**
	 * @param order
	 * @return
	 */
	public Order modifyOrder(Order order);

	/**
	 * @param orderId
	 * @return requested order
	 */
	public Order findOrderById(Integer orderId);

	/**
	 * @param order
	 * @return deleted order
	 */
	public Order removeOrder(Order order);

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
