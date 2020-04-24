/**
 * 
 */
package com.avish.cleaningservice.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avish.cleaningservice.dao.AddressDao;
import com.avish.cleaningservice.model.Address;
import com.avish.cleaningservice.service.AddressService;

/**
 * @author PC
 *
 */
@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressDao addressDao;

	@Override
	public Address createAddress(Address address) {
		return addressDao.createAddress(address);
	}

	@Override
	public Address findAddressById(Integer addressId) {
		// TODO Auto-generated method stub
		return null;
	}

}
