package com.fon.jobs.entity;

public class FonEmployee {
	
	private final boolean lunchHelp;
	private final String salary;
	private final String fun;
	
	public FonEmployee() {
		this.lunchHelp = true;
		this.salary = "negotiable";
		this.fun = "guaranteed";
	}

	public boolean isLunchHelp() {
		return lunchHelp;
	}

	public String getSalary() {
		return salary;
	}

	public String getFun() {
		return fun;
	}
	
}
