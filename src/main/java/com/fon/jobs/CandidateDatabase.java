package com.fon.jobs;

import java.util.List;

import com.fon.jobs.entity.FonDeveloper;

public interface CandidateDatabase {
	
	public CandidateDatabase select(String query);
	
	public CandidateDatabase from(String from);
	
	public CandidateDatabase where(String filter);
	
	public FonDeveloper execute();

	public CandidateDatabase orderBy(List<String> orderBy);

	public CandidateDatabase limit(int i);

}
