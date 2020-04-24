package com.avish.cleaningservice.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.avish.cleaningservice.dao.CleaningTypeDao;
import com.avish.cleaningservice.model.CleaningType;

@Repository
public class CleaningTypeDaoImpl implements CleaningTypeDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public CleaningType createCleaningType(CleaningType cleaningType) {
		entityManager.persist(cleaningType);
		return cleaningType;
	}

	@Override
	@Transactional
	public CleaningType modifyCleaning(CleaningType cleaningType) {
		entityManager.merge(cleaningType);
		return cleaningType;
	}

	@Override
	@Transactional
	public CleaningType findCleaningTypeById(Integer cleaninfTypeId) {
		return entityManager.find(CleaningType.class, cleaninfTypeId);
	}

	@Override
	public List<CleaningType> getAllCleaningServices() {
		return entityManager.createQuery("SELECT ct FROM CleaningType ct", CleaningType.class).getResultList();
	}

	@Override
	public CleaningType deleteCleaningTypeById(CleaningType cleaningType) {
		entityManager.remove(cleaningType);
		return cleaningType;
	}

	@Override
	public CleaningType getCleaningTypeById(Integer id) {
		return entityManager.find(CleaningType.class, id);
	}

}
