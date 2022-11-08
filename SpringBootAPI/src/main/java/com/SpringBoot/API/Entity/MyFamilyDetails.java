
package com.SpringBoot.API.Entity;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class MyFamilyDetails {

	private int id;
	
	private String Name;
}
