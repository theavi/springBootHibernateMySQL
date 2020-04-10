package com.avish.cleaningservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avish.cleaningservice.model.Test;
import com.avish.cleaningservice.service.TestService;

@RestController
public class HomeResource {

	@Autowired
	private TestService testService;

	@RequestMapping(value = "/")
	public List<Test> getAll() {
		System.out.println("LIST :" + testService.getAll());
		return testService.getAll();
	}
}
