package com.avish.cleaningservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.avish.cleaningservice.dto.CleaningTypeDto;
import com.avish.cleaningservice.model.CleaningType;
import com.avish.cleaningservice.service.CleaningTypeService;

/**
 * 
 * @author Avinash
 *
 */
@RestController
@RequestMapping(value = "/cleaningType")
public class CleaningTypeResource {

	@Autowired
	private CleaningTypeService cleaningTypeService;

	@PostMapping
	public CleaningType createCleaningType(@RequestBody CleaningTypeDto cleaningTypeDto) {
		return cleaningTypeService.createCleaningType(cleaningTypeDto);
	}

	@PutMapping(value = "/id=?&name=?")
	public CleaningType modifyCleaningType(@RequestParam("id") Integer id, @RequestParam("name") String name) {

		return cleaningTypeService.modifyCleaningType(id, name);

	}

	@GetMapping
	public List<CleaningType> getAllCleaningType() {
		return cleaningTypeService.getAllCleaningServices();
	}

	@GetMapping(value = "/{id}")
	public CleaningType getCleaningTypeById(@PathVariable("id") Integer id) {
		return cleaningTypeService.getCleaningServiceTypeById(id);
	}

	@DeleteMapping(value = "{id}")
	public CleaningType deleteCleaningTypeById(@PathVariable("id") Integer id) {
		return cleaningTypeService.deleteCleaningTypeById(id);
	}

}
