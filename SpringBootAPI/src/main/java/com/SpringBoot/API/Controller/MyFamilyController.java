package com.SpringBoot.API.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.API.Entity.MyFamilyDetails;
import com.SpringBoot.API.Service.MyFamilyService;

@RestController
@RequestMapping("/family")
public class MyFamilyController {

	@Autowired
	private MyFamilyService familyService;
	
	@PostMapping("/save")
	public MyFamilyDetails postFamilyDetails(@RequestBody MyFamilyDetails familyDetails) {
		return familyService.saveFamilyDetails(familyDetails);
	}
	
	@GetMapping("/{id}")
	public MyFamilyDetails retriveFamilyDetails(@PathVariable int id) {
		return familyService.getFamilyDetails(id);
	}
	
	@DeleteMapping("/{id}")
	public String removieFamilyDetails(@PathVariable int id) {
		return familyService.deleteFamilyDetails(id);
	}
	
	@DeleteMapping
	public String DeleteAll() {
		return familyService.deleteAll();
	}
}
