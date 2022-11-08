
package com.SpringBoot.API.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.API.Entity.MyFamilyDetails;
import com.SpringBoot.API.Repository.MyFamilyRepository;

@Service
public class MyFamilyService {

	@Autowired
	private MyFamilyRepository familyRepository;
	
	public MyFamilyDetails saveFamilyDetails (MyFamilyDetails familyDetails) {
		
		return familyRepository.save(familyDetails);
		
	}

	public MyFamilyDetails getFamilyDetails(int id) {
		
		return familyRepository.findById(id).orElse(null);
		
	}
	
	public String deleteFamilyDetails(int id) {
		
		 familyRepository.deleteById(id);
		
		 return " Data Deleted ---> " + id ;
	}
	
	public String deleteAll() {
		 familyRepository.deleteAll();
		 return "Deleted All Data";
	}
}
