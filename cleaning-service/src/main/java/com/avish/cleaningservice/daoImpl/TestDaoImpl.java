package com.avish.cleaningservice.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.avish.cleaningservice.dao.TestDao;
import com.avish.cleaningservice.model.Test;

//https://www.concretepage.com/spring-boot/spring-boot-rest-jpa-hibernate-mysql-example
@Repository
public class TestDaoImpl implements TestDao {
	@PersistenceContext
	private EntityManager entityManager;

	public List<Test> getAll() {
		String hql = "FROM Test";
		return (List<Test>) entityManager.createQuery(hql).getResultList();

	}

}
