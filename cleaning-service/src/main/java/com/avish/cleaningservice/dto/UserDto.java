/**
 * 
 */
package com.avish.cleaningservice.dto;

import com.avish.cleaningservice.model.Address;

/**
 * @author PC
 *
 */
public class UserDto {
	private Integer id;
	/**
	 * firstName
	 */
	private String firstName;
	/**
	 * lastName
	 */
	private String lastName;
	/**
	 * address
	 */
	private Address address;
	/**
	 * mobile
	 */
	private Long mobile;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the mobile
	 */
	public Long getMobile() {
		return mobile;
	}

	/**
	 * @param mobile
	 *            the mobile to set
	 */
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the isBroker
	 */
	public Integer getIsBroker() {
		return isBroker;
	}

	/**
	 * @param isBroker
	 *            the isBroker to set
	 */
	public void setIsBroker(Integer isBroker) {
		this.isBroker = isBroker;
	}

	/**
	 * email
	 */
	private String email;
	/**
	 * username
	 */
	private String userName;
	/**
	 * password
	 */
	private String password;
	/**
	 * isBroker
	 */
	private Integer isBroker;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserDto [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", mobile=" + mobile + ", email=" + email + ", userName=" + userName + ", password=" + password
				+ ", isBroker=" + isBroker + "]";
	}

}
