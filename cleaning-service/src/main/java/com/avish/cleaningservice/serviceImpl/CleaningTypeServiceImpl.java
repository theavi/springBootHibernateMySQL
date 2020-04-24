package com.avish.cleaningservice.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.avish.cleaningservice.dao.CleaningTypeDao;
import com.avish.cleaningservice.dto.CleaningTypeDto;
import com.avish.cleaningservice.model.CleaningType;
import com.avish.cleaningservice.service.CleaningTypeService;

@Service
public class CleaningTypeServiceImpl implements CleaningTypeService {

	private CleaningTypeDao cleaningTypeDao;

	@Override
	public CleaningType createCleaningType(CleaningTypeDto cleaningTypeDto) {
		CleaningType cleaningType = new CleaningType();
		cleaningType.setName(cleaningTypeDto.getName());
		return cleaningTypeDao.createCleaningType(cleaningType);
	}

	@Override
	public CleaningType modifyCleaningType(Integer id, String name) {
		CleaningType cleaningType = cleaningTypeDao.findCleaningTypeById(id);
		if (null != cleaningType) {
			cleaningType.setName(name);
		}
		return cleaningType;
	}

	@Override
	public CleaningType findCleaningTypeById(Integer clyninfTypeId) {
		return cleaningTypeDao.findCleaningTypeById(clyninfTypeId);
	}

	@Override
	public List<CleaningType> getAllCleaningServices() {
		return cleaningTypeDao.getAllCleaningServices();
	}

	@Override
	public CleaningType deleteCleaningTypeById(Integer id) {
		CleaningType cleaningType = cleaningTypeDao.getCleaningTypeById(id);
		cleaningTypeDao.deleteCleaningTypeById(cleaningType);
		return cleaningType;
	}

	@Override
	public CleaningType getCleaningServiceTypeById(Integer id) {
		return cleaningTypeDao.getCleaningTypeById(id);
	}

}
