/**
 * 
 */
package com.avish.cleaningservice.dto;

/**
 * @author PC
 *
 */
public class OrderDto {
	/*
	 * id
	 */
	private Integer id;
	/*
	 * orderType
	 */
	private Integer orderType;
	/*
	 * customerId
	 */
	private Integer customerId;
	/*
	 * brokerId
	 */
	private Integer brokerId;

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
	 * @return the orderType
	 */
	public Integer getOrderType() {
		return orderType;
	}

	/**
	 * @param orderType
	 *            the orderType to set
	 */
	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}

	/**
	 * @return the customerId
	 */
	public Integer getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId
	 *            the customerId to set
	 */
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the brokerId
	 */
	public Integer getBrokerId() {
		return brokerId;
	}

	/**
	 * @param brokerId
	 *            the brokerId to set
	 */
	public void setBrokerId(Integer brokerId) {
		this.brokerId = brokerId;
	}

}
