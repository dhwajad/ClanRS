package me.clanrs.model.entity;

import java.util.ArrayList;
import java.util.List;

public class Member extends Person {
	
	private Person parent1;
	
	private Person parent2;
	
	private Person spouse;
	
	private List<Person> exSpouses = new ArrayList<>();

	private Clan clan;
	
	private Origin origin;

}
