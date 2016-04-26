package com.fon.jobs.entity;

public class FonDeveloper extends FonEmployee {
	
	private final String name;
	private final String surname;
	private final String email;
	private final int minSalary;
	
	public FonDeveloper() {
		name="Pepe";
		surname="Corredera";
		email="jca.formacion@gmail.com";
		minSalary=45000;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getEmail() {
		return email;
	}

	public int getMinSalary() {
		return minSalary;
	}

}
