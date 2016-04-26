package com.fon.jobs;

import java.util.List;

import com.fon.jobs.entity.FonDeveloper;

public class LinkedinDatabase implements CandidateDatabase {

	@Override
	public CandidateDatabase select(String query) {
		if(isValidParameter("profesional")) {
			return this;
		}
		throw new IllegalArgumentException("not amateur....");
	}

	@Override
	public CandidateDatabase from(String from) {
		if(isValidParameter("Madrid")) {
			return this;
		}
		throw new IllegalArgumentException("born in Madrid, please....");
	}

	@Override
	public CandidateDatabase where(String filter) {
		if(isValidParameter("java>=15")) {
			return this;
		}
		throw new IllegalArgumentException("not expert....");
	}

	@Override
	public FonDeveloper execute() {
		return new FonDeveloper();
	}

	@Override
	public CandidateDatabase orderBy(List<String> orderBy) {
		if(orderBy!=null && !orderBy.isEmpty()) {
			return this;
		}
		throw new IllegalArgumentException("not amateur....");
	}

	@Override
	public CandidateDatabase limit(int i) {
		if(i==1) {
			return this;
		}
		throw new IllegalArgumentException("more elements in database....");
	}
	
	private boolean isValidParameter(String param) {
		return param!=null && !param.isEmpty();
	}

}
