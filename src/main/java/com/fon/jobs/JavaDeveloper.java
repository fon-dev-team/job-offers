package com.fon.jobs;

import java.util.ArrayList;
import java.util.List;

import com.fon.jobs.entity.FonDeveloper;

public class JavaDeveloper extends JobOfferForDeveloper {
	private static final int MAX_HOURS=8;
	
	private CandidateDatabase db;
	private int totalHoursWorking;
	
	public JavaDeveloper(CandidateDatabase db) {
		this.db=db;
		this.totalHoursWorking=8;
	}

	@Override
	public FonDeveloper getRecruit() {

		// What do we require?
		db.select("JavaDevelopper");

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
		where += "  OR NoSql      = 'bonus')";

		db.where(where);

		// How should we prioritize?
		List<String> orderBy = new ArrayList<String>();
		orderBy.add("ability DESC");
		orderBy.add("hardWorking DESC");
		orderBy.add("sociable DESC");
		orderBy.add("party-people DESC");

		db.orderBy(orderBy);

		// How many results do we need?
		db.limit(1);

		return db.execute();
	}

	@Override
	protected void setBenefits() {
		if(totalHoursWorking > MAX_HOURS) {
			throw new RuntimeException("send to home, please");
		}
	}

}
