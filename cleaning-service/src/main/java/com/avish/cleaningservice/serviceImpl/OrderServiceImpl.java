package com.avish.cleaningservice.serviceImpl;
/**
 * 
 * @author Avinash
 *
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avish.cleaningservice.dao.OrderDao;
import com.avish.cleaningservice.dto.OrderDto;
import com.avish.cleaningservice.model.Order;
import com.avish.cleaningservice.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderDao orderDao;

	@Override
	public Order createOrder(OrderDto orderDto) {
		Order order = new Order();
		order.setCustomerId(orderDto.getCustomerId());
		order.setBrokerId(orderDto.getBrokerId());
		order.setOrderType(orderDto.getOrderType());
		return orderDao.createOrder(order);
	}

	@Override
	public Order modifyOrder(OrderDto orderDto) {
		Order order = orderDao.findOrderById(orderDto.getId());
		if (null != order) {
			order.setBrokerId(orderDto.getBrokerId());
			order.setCustomerId(orderDto.getCustomerId());
			order.setOrderType(orderDto.getOrderType());
			return orderDao.modifyOrder(order);
		}
		return order;
	}

	@Override
	public Order findOrderById(Integer orderId) {
		return orderDao.findOrderById(orderId);
	}

	@Override
	public Order removeOrder(Integer orderId) {
		Order order = orderDao.findOrderById(orderId);
		if (null != order) {
			orderDao.removeOrder(order);
		}
		return order;
	}

	@Override
	public List<Order> findAllOrders() {
		return orderDao.findAllOrders();
	}

	@Override
	public List<Order> findOrderByOrderType(Integer orderId) {
		return orderDao.findOrderByOrderType(orderId);
	}

	@Override
	public List<Order> findOrderByUser(Integer userId) {
		return orderDao.findOrderByUser(userId);
	}

}
