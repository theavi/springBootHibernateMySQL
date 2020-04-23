package com.avish.cleaningservice.daoImpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.avish.cleaningservice.dao.AddressDao;
import com.avish.cleaningservice.model.Address;

@Repository
public class AddressDaoImpl implements AddressDao {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public Address createAddress(Address address) {
		entityManager.persist(address);
		System.out.println("DAO :" + address.getId());
		return address;
	}

	@Override
	@Transactional
	public Address deleteAddress(Address address) {
		entityManager.remove(entityManager.contains(address) ? address : entityManager.merge(address));
		return address;
	}

	@Override
	public Address findAddressById(Integer addressId) {
		return entityManager.find(Address.class, addressId);
	}

	@Override
	@Transactional
	public Address updateAddress(Address address) {
		entityManager.persist(address);
		return address;
	}

}
