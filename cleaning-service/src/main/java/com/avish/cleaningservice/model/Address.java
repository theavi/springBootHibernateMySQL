package com.avish.cleaningservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * @author :Avinash this class represent address table in the database
 *
 */
@Entity
public class Address {
	/**
	 * id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	/**
	 * houseName
	 */
	private String houseName;
	/**
	 * areaName
	 */
	private String areaName;
	/**
	 * tehsil
	 */
	private String tehsil;
	/**
	 * district
	 */
	private String district;
	/**
	 * state
	 */
	private String state;
	/**
	 * country
	 */
	private String country;
	/**
	 * isPrimary
	 */
	private Integer isPrimary;

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
	 * @return the houseName
	 */
	public String getHouseName() {
		return houseName;
	}

	/**
	 * @param houseName
	 *            the houseName to set
	 */
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	/**
	 * @return the areaName
	 */
	public String getAreaName() {
		return areaName;
	}

	/**
	 * @param areaName
	 *            the areaName to set
	 */
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	/**
	 * @return the tehsil
	 */
	public String getTehsil() {
		return tehsil;
	}

	/**
	 * @param tehsil
	 *            the tehsil to set
	 */
	public void setTehsil(String tehsil) {
		this.tehsil = tehsil;
	}

	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}

	/**
	 * @param district
	 *            the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the isPrimary
	 */
	public Integer getIsPrimary() {
		return isPrimary;
	}

	/**
	 * @param isPrimary
	 *            the isPrimary to set
	 */
	public void setIsPrimary(Integer isPrimary) {
		this.isPrimary = isPrimary;
	}

}
