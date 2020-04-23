package com.avish.cleaningservice.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avish.cleaningservice.dao.AddressDao;
import com.avish.cleaningservice.dao.UserDao;
import com.avish.cleaningservice.dto.UserDto;
import com.avish.cleaningservice.model.Address;
import com.avish.cleaningservice.model.User;
import com.avish.cleaningservice.service.UserService;

/**
 * 
 * @author Avinash
 *
 */
@Service
class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private AddressDao addressDao;

	@Override
	public User createUser(UserDto userDto) {
		Address address = new Address();
		address.setHouseName(userDto.getAddress().getHouseName());
		address.setAreaName(userDto.getAddress().getAreaName());
		address.setTehsil(userDto.getAddress().getTehsil());
		address.setDistrict(userDto.getAddress().getDistrict());
		address.setState(userDto.getAddress().getState());
		address.setCountry(userDto.getAddress().getCountry());
		address.setIsPrimary(userDto.getAddress().getIsPrimary());
		Address addressObj = addressDao.createAddress(address);
		User user = new User();
		user.setAddress(addressObj.getId());
		user.setEmail(userDto.getEmail());
		user.setFirstName(userDto.getFirstName());
		user.setIsBroker(userDto.getIsBroker());
		user.setLastName(userDto.getLastName());
		user.setMobile(userDto.getMobile());
		user.setPassword(userDto.getPassword());
		user.setUserName(userDto.getUserName());
		try {
			return userDao.createUser(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			addressDao.deleteAddress(addressObj);
		}
		return user;
		// return userDao.addUserWithOutTransection(user);
	}

	@Override
	public User modifyUser(UserDto userDto) {
		User user = userDao.findUserById(userDto.getId());
		if (null != user) {
			Address address = addressDao.findAddressById(user.getAddress());
			address.setHouseName(userDto.getAddress().getHouseName());
			address.setAreaName(userDto.getAddress().getAreaName());
			address.setTehsil(userDto.getAddress().getTehsil());
			address.setDistrict(userDto.getAddress().getDistrict());
			address.setState(userDto.getAddress().getState());
			address.setCountry(userDto.getAddress().getCountry());
			address.setIsPrimary(userDto.getAddress().getIsPrimary());
			addressDao.updateAddress(address);
			user.setEmail(userDto.getEmail());
			user.setFirstName(userDto.getFirstName());
			user.setIsBroker(userDto.getIsBroker());
			user.setLastName(userDto.getLastName());
			user.setMobile(userDto.getMobile());
			user.setPassword(userDto.getPassword());
			user.setUserName(userDto.getUserName());
			try {
				return userDao.modifyUser(user);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return null;
	}

	@Override
	public User deleteUser(Integer userId) {
		User isExist = userDao.findUserById(userId);
		if (null != isExist) {
			return userDao.deleteUser(isExist);
		}
		return null;
	}

	@Override
	public List<User> getAllUser() {
		return userDao.getAllUser();
	}

}
