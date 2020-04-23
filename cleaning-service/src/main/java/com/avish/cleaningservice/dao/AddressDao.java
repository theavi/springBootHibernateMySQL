package com.avish.cleaningservice.dao;

import com.avish.cleaningservice.model.Address;

/**
 * 
 * @author Avinash
 *
 */
public interface AddressDao {

	/**
	 * @param addressId
	 * @return
	 */
	public Address findAddressById(Integer addressId);

	/**
	 * @param address
	 * @return
	 */
	public Address createAddress(Address address);

	/**
	 * @param addressId
	 * @return
	 */
	public Address deleteAddress(Address address);

	/**
	 * @param address
	 * @return
	 */
	public Address updateAddress(Address address);
}
