/**
 * 
 */
package com.avish.cleaningservice.service;

import com.avish.cleaningservice.model.Services;

/**
 * @author PC
 *
 */
public interface ServicesService {

	/**
	 * @param servicesDto
	 * @return
	 */
	public Services createService(String name, Integer cleaningType);

	/**
	 * @param services
	 * @return
	 */
	public Services modifyService(Integer servicesId, String servicesName, Integer cleaningType);

	/**
	 * @param servicesId
	 * @return
	 */
	public Services removeService(Integer servicesId);

	/**
	 * @param servicesId
	 * @return
	 */
	public Services findServicesById(Integer servicesId);
}
