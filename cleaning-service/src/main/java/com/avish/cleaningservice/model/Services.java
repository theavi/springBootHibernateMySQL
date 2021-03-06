package com.avish.cleaningservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * @author Avinash this class represent the service table in the database
 *
 */
@Entity(name="service")
public class Services {
	/*
	 * id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	/*
	 * name
	 */
	private String name;
	/*
	 * cleaningType
	 */
	private Integer cleaningType;

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
		return cleaningType;
	}

	/**
	 * @param cleaningType
	 *            the cleaningType to set
	 */
	public void setCleaningType(Integer cleaningType) {
		this.cleaningType = cleaningType;
	}

}
