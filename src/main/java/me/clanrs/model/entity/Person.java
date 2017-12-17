package me.clanrs.model.entity;

import java.time.LocalDate;

import javax.mail.internet.InternetAddress;

public class Person {
	
	private long id;
	
	private String firstName;
	
	private String middleName;
	
	private String lastName;
	
	private Education education;
	
	private Occupation occupation;
	
	private InternetAddress email;
	
	private LocalDate birthDate;
	
	private LocalDate deceasedDate;
	
	private Gender gender;

}
