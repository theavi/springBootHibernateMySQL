package com.avish.cleaningservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.avish.cleaningservice.dao.UserDao;
import com.avish.cleaningservice.dto.UserDto;
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
	public User create(@RequestBody UserDto userDto) {
		System.out.println(userDto.toString());
		return userService.createUser(userDto);
	}

	@RequestMapping(value = "/user", method = RequestMethod.PUT)
	public User modifyUser(@RequestBody User user) {
		System.out.println(user.toString());
		return userService.modifyUser(user);

	}

	@RequestMapping(value = "/user", method = RequestMethod.DELETE)
	public User deleteUser(Integer userId) {
		return userService.deleteUser(userId);

	}

	@GetMapping(value = "user")
	public List<User> getAllUser() {
		return userService.getAllUser();
	}

	@RequestMapping(value = "/createAddress")
	public Address create(@RequestBody Address address) {
		addressService.createAddress(address);
		return address;

	}
}
