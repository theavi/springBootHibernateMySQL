package com.avish.cleaningservice.service;

import com.avish.cleaningservice.model.Address;

public interface AddressService {

	/**
	 * @param address
	 * @return
	 */
	public Address createAddress(Address address);
	/**
	 * @param addressId
	 * @return
	 */
	public Address findAddressById(Integer addressId);
}
