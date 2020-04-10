package com.avish.cleaningservice.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avish.cleaningservice.dao.TestDao;
import com.avish.cleaningservice.model.Test;
import com.avish.cleaningservice.service.TestService;

@Service
class TestServiceImpl implements TestService {

	@Autowired
	private TestDao testDao;

	@Override
	public List<Test> getAll() {
		// TODO Auto-generated method stub
		return testDao.getAll();
	}

}
