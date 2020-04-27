package com.avish.cleaningservice.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.UpperCase;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.avish.cleaningservice.dao.OrderDao;
import com.avish.cleaningservice.model.Order;

/**
 * 
 * @author Avinash
 *
 */

@Repository
public class OrderDaoImpl implements OrderDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public Order createOrder(Order order) {
		entityManager.persist(order);
		return order;
	}

	@Override
	@Transactional
	public Order modifyOrder(Order order) {
		entityManager.merge(order);
		return order;
	}

	@Override
	public Order findOrderById(Integer orderId) {
		return entityManager.find(Order.class, orderId);
	}

	@Override
	@Transactional
	public Order removeOrder(Order order) {
		entityManager.remove(entityManager.contains(order) ? order : entityManager.merge(order));
		return order;
	}

	@Override
	public List<Order> findAllOrders() {

		return entityManager.createQuery("SELECT o FROM tbl_order o", Order.class).getResultList();
	}

	@Override
	@Query("SELECT O FROM ORDER O WHERE O.orderType=:orderId")
	public List<Order> findOrderByOrderType(Integer orderId) {
		return null;
	}

	@Override
	@Query("SELECT O FROM ORDER O WHERE O.customerId=:userId")
	public List<Order> findOrderByUser(Integer userId) {
		return null;
	}

}
