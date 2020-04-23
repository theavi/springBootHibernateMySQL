package com.avish.cleaningservice.service;

import java.util.List;

import com.avish.cleaningservice.dto.UserDto;
import com.avish.cleaningservice.model.User;

/**
 * 
 * @author AVinash
 *
 */
public interface UserService {
	/**
	 * @param user
	 * @return created user
	 */
	public User createUser(UserDto userDto);

	/**
	 * @param user
	 * @return modified user
	 */
	public User modifyUser(UserDto userDto);

	/**
	 * @return
	 */
	public List<User> getAllUser();

	/**
	 * @param userId
	 * @return
	 */
	public User deleteUser(Integer userId);

}
