package com.avish.cleaningservice.service;

import java.util.List;

import com.avish.cleaningservice.dto.CleaningTypeDto;
import com.avish.cleaningservice.model.CleaningType;

/**
 * 
 * @author Avinash
 *
 */
public interface CleaningTypeService {
	/**
	 * @param cleaningTypeDto
	 * @return CleaningType
	 */
	public CleaningType createCleaningType(CleaningTypeDto cleaningTypeDto);

	/**
	 * @param cleaningTypeDto
	 * @return
	 */
	public CleaningType modifyCleaningType(Integer id, String name);

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
	public CleaningType getCleaningServiceTypeById(Integer id);

	/**
	 * @param cleaningType
	 * @return
	 */
	public CleaningType deleteCleaningTypeById(Integer id);

}
