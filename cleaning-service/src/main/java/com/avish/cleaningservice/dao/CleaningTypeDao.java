package com.avish.cleaningservice.dao;

import java.util.List;

import com.avish.cleaningservice.model.CleaningType;

public interface CleaningTypeDao {
	/**
	 * @param cleaningTypeDto
	 * @return
	 */
	public CleaningType createCleaningType(CleaningType cleaningType);

	/**
	 * @param cleaningType
	 * @return
	 */
	public CleaningType modifyCleaning(CleaningType cleaningType);

	/**
	 * @param clyninfTypeId
	 * @return
	 */
	public CleaningType findCleaningTypeById(Integer clyninfTypeId);

	/**
	 * @return
	 */
	public List<CleaningType> getAllCleaningServices();

	/**
	 * @param id
	 * @return
	 */
	public CleaningType getCleaningTypeById(Integer id);

	/**
	 * @param cleaningType
	 * @return
	 */
	public CleaningType deleteCleaningTypeById(CleaningType cleaningType);
}
