package com.avish.cleaningservice.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.avish.cleaningservice.dao.UserDao;
import com.avish.cleaningservice.model.User;

//https://www.concretepage.com/spring-boot/spring-boot-rest-jpa-hibernate-mysql-example
/**
 * @author PC
 *
 */
@Repository
public class UserDaoImpl implements UserDao {
	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public User createUser(User user) {
		entityManager.persist(user);
		return user;
	}

	@Transactional
	public User addUserWithOutTransection(User user) {
		entityManager.persist(user);
		return user;
	}

	@Override
	@Transactional
	public User modifyUser(User user) {
		return entityManager.merge(user);
	}

	@Override
	public User findUserById(Integer userId) {
		return entityManager.find(User.class, userId);
	}

	@Transactional
	@Override
	public User deleteUser(User user) {
		entityManager.remove(entityManager.contains(user) ? user : entityManager.merge(user));
		return user;
	}

	@Override
	public List<User> getAllUser() {
		return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
	}

}
