/**
 * 
 */
package com.avish.cleaningservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.avish.cleaningservice.model.Services;
import com.avish.cleaningservice.service.ServicesService;

/**
 * @author Avinash
 *
 */
@RestController
@RequestMapping(value = "/services")
public class ServicesResources {

	@Autowired
	private ServicesService servicesService;

	@PostMapping
	public Services createService(@RequestParam("servicesName") String name,
			@RequestParam("cleaningType") Integer cleaningType) {
		System.out.println("I got call");
		return servicesService.createService(name, cleaningType);

	}

	@PutMapping
	public Services modifyServices(@RequestParam("servicesId") Integer servicesid,
			@RequestParam("servicesName") String servicesName, @RequestParam("cleaningType") Integer cleaningType) {
		return servicesService.modifyService(servicesid, servicesName, cleaningType);

	}

	@GetMapping(value = "/{servicesId}")
	public Services findServicesById(@PathVariable("servicesId") Integer servicesId) {
		return servicesService.findServicesById(servicesId);

	}

	@DeleteMapping(value = "/{servicesId}")
	public Services removeService(@PathVariable("servicesId") Integer serviceId) {
		return servicesService.removeService(serviceId);
	}

}
