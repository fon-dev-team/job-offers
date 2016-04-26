package com.fon.jobs;

import java.util.List;

import com.fon.jobs.entity.FonDeveloper;

public interface JobOffer {
	
	public FonDeveloper getRecruit();
	
	public List<String> getActualProjects();
	
	public List<String> getActualTechnologies();

}
