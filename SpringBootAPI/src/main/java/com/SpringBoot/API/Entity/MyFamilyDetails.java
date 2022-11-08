
package com.SpringBoot.API.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name="My_Family")
public class MyFamilyDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id ;
	
	@Column(name = "Person_Name")
	private String Name;
	
	@Column(name = "Person_Age")
	private int age;
	
	@Column(name = "Person_Age")
	private int phoneNumber;
	
	@Column(name = "Person_Gender")
	private String gender;
	
	@Column(name = "Person_Relationship")
	private String relationship;
	
}
