package com.avish.cleaningservice.dao;

import java.util.List;

import com.avish.cleaningservice.model.User;

/**
 * 
 * @author Avinash
 *
 */
public interface UserDao {
	/**
	 * @param user
	 * @return new created user
	 */
	public User createUser(User user);

	/**
	 * @param user
	 * @return return modified user
	 */
	public User modifyUser(User user);

	/**
	 * @param userId
	 * @return
	 */
	public User findUserById(Integer userId);

	/**
	 * @param userId
	 * @return
	 */
	public User deleteUser(User user);
	/**
	 * @return
	 */
	public List<User> getAllUser() ;

	/**
	 * @param user
	 * @return
	 */
	public User addUserWithOutTransection(User user);
}
