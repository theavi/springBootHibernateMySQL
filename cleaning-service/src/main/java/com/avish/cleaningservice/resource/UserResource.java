package com.avish.cleaningservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.avish.cleaningservice.model.Address;
import com.avish.cleaningservice.model.User;
import com.avish.cleaningservice.service.AddressService;
import com.avish.cleaningservice.service.UserService;

/**
 * 
 * @author Avinash
 * 
 *         This is the front controller for user operation
 *
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class UserResource {

	@Autowired
	private UserService userService;
	@Autowired
	private AddressService addressService;

	@RequestMapping(value = "/user", method = RequestMethod.POST, consumes = { "application/json" }, produces = {
			"application/json" })
	public User create(@RequestBody User user) {
		System.out.println(user.toString());
		return userService.createUser(user);
	}

	
}
