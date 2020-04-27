package com.avish.cleaningservice.dao;

import com.avish.cleaningservice.model.Services;

public interface ServicesDao {

	/**
	 * @param services
	 * @return
	 */
	public Services createService(Services services);

	/**
	 * @param services
	 * @return
	 */
	public Services modifyService(Services services);

	/**
	 * @param services
	 * @return
	 */
	public Services removeService(Services services);

	/**
	 * @param servicesId
	 * @return
	 */
	public Services findServicesById(Integer servicesId);
}
