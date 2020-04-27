/**
 * 
 */
package com.avish.cleaningservice.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avish.cleaningservice.dao.ServicesDao;
import com.avish.cleaningservice.model.Services;
import com.avish.cleaningservice.service.ServicesService;

/**
 * @author Avinash
 *
 */
@Service
public class ServicesServiceImpl implements ServicesService {

	@Autowired
	private ServicesDao servicesDao;

	@Override
	public Services createService(String name, Integer cleaningType) {
		Services service = new Services();
		service.setName(name);
		service.setCleaningType(cleaningType);
		return servicesDao.createService(service);
	}

	@Override
	public Services modifyService(Integer servicesId, String servicesName, Integer cleaningType) {
		Services services = servicesDao.findServicesById(servicesId);
		if (null != services) {
			services.setCleaningType(cleaningType);
			services.setName(servicesName);
			return servicesDao.modifyService(services);
		}

		return null;
	}

	@Override
	public Services removeService(Integer servicesId) {
		Services services = servicesDao.findServicesById(servicesId);
		return servicesDao.removeService(services);
	}

	@Override
	public Services findServicesById(Integer servicesId) {
		return servicesDao.findServicesById(servicesId);
	}

}
