package com.fon.jobs;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloper extends JobOffer {

	public String company = "Fon Technology";

	public String address = "Quintanavides, 15, 28050, Madrid";

	private String email = "talent@fon.com";

	public FonDevelopper getRecruit() {

		// What do we require?
		db.select("JavaDeveloper");

		// From where are we selecting?
		db.from("PeopleWhoLoveDevelopment");

		// Select criteria
		String where = "Java & Spring = 'Strong' ";
		where += " AND  Git           = 'medium' ";
		where += " AND  experience    >= '2 years' ";
		where += " AND  Unit Testing  = 'medium' ";
		where += " AND (Hibernate = 'bonus' ";
		where += "  OR Linux      = 'bonus' ";
		where += "  OR TDD        = 'bonus' ";
		where += "  OR NoSql      = 'bonus'";

		where.replace(" & Spring = 'Strong'", " = 'SuperSaiyan' AND Spring = 'Not much'");
		where.replace("TDD", "GTD");
		where += "  OR Meteor = 'bonus')";


		db.where(where);

		// How should we prioritize?
		List<String> orderBy = new ArrayList<>();
		orderBy.add("ability DESC");
		orderBy.add("hardWorking DESC");
		orderBy.add("sociable DESC");
		orderBy.add("party-people DESC");
		orderBy.add("early-tech-adopter DESC");

		db.orderBy(orderBy);

		// How many results do we need?
		db.limit(1);

		return db.execute();
	}

	public List<String> getActualProjects() {
		List<String> projects = new ArrayList<>();
		projects.add("Payment Gateways Integration");
		projects.add("Social Networks Integration");
		projects.add("Wifi For Bussines");
		projects.add("Billing Systems");
		projects.add("Platform evolution");

		return projects;
	}

	public List<String> getActualTechnologies() {
		List<String> techs = new ArrayList<>();
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

	protected void setBenefits() {
		this.lunchHelp = true;
		this.salary = "negotiable";
		this.fun = "guaranteed";
		this.flexibleTiming = "maybe?";
		this.petProjects = "any chance?";
	}
}
