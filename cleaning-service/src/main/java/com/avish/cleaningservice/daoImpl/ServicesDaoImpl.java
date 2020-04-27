package com.avish.cleaningservice.daoImpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.avish.cleaningservice.dao.ServicesDao;
import com.avish.cleaningservice.model.Services;

@Repository
public class ServicesDaoImpl implements ServicesDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public Services createService(Services services) {
		entityManager.persist(services);
		return services;
	}

	@Override
	@Transactional
	public Services modifyService(Services services) {
		entityManager.merge(services);
		return services;
	}

	@Override
	@Transactional
	public Services removeService(Services services) {
		entityManager.remove(entityManager.contains(services) ? services : entityManager.merge(services));
		return services;
	}

	@Override
	public Services findServicesById(Integer servicesId) {
		return entityManager.find(Services.class, servicesId);
	}

}
