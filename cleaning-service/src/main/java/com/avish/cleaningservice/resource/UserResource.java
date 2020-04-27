package com.avish.cleaningservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService userService;


	@PostMapping
	public User create(@RequestBody UserDto userDto) {
		System.out.println(userDto.toString());
		return userService.createUser(userDto);
	}

	@PutMapping
	public User modifyUser(@RequestBody UserDto userDto) {
		return userService.modifyUser(userDto);

	}

	@DeleteMapping(value = "/{userId}")
	public User deleteUser(@PathVariable("userId") Integer userId) {
		return userService.deleteUser(userId);

	}

	@GetMapping(value = "/{userId}")
	public User findUserById(@PathVariable("userId") Integer userId) {

		return userService.findUserById(userId);
	}

	@GetMapping
	public List<UserDto> getAllUser() {
		return userService.getAllUser();
	}

}
