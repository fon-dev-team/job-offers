package com.fon.jobs;

import java.util.ArrayList;
import java.util.List;

public abstract class JobOfferForDeveloper implements JobOffer {
	
	protected String company = "Fon Technology";
	protected String address = "Quintanavides, 15, 28050, Madrid";
	protected String email = "talent@fon.com";
	
	@Override
	public List<String> getActualProjects() {
		List<String> projects = new ArrayList<String>();
		projects.add("Payment Gateways Integration");
		projects.add("Social Networks Integration");
		projects.add("Wifi For Bussines");
		projects.add("Billing Systems");
		projects.add("Platform evolution");
		return projects;
	}

	@Override
	public List<String> getActualTechnologies() {
		List<String> techs = new ArrayList<String>();
		techs.add("Java 7-8");
		techs.add("Tomcat");
		techs.add("Spring-Boot");
		techs.add("NoSql - MongoDb, Redis");
		techs.add("Sql   - Mysql");
		techs.add("Thrift - https://thrift.apache.org/");
		techs.add("SOAP Webservices");
		techs.add("Git");
		techs.add("Eclipse");
		techs.add("Maven");
		techs.add("Continuous Integration - Jenkins, Sonarqube");
		return techs;
	}
	
	protected abstract void setBenefits();

}
