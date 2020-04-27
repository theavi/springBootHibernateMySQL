package com.avish.cleaningservice.dto;

import com.avish.cleaningservice.model.CleaningType;

public class ServicesDto {
	/*
	 * id
	 */
	private Integer id;
	/*
	 * name
	 */
	private String name;
	/*
	 * cleaningType
	 */
	private Integer cleaningTypeId;

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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the cleaningType
	 */
	public Integer getCleaningType() {
		return cleaningTypeId;
	}

	/**
	 * @param cleaningType
	 *            the cleaningType to set
	 */
	public void setCleaningType(Integer cleaningType) {
		this.cleaningTypeId = cleaningType;
	}

}
