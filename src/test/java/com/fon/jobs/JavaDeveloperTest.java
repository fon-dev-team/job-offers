package com.fon.jobs;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import com.fon.jobs.entity.FonDeveloper;

public class JavaDeveloperTest {

	@Test
	public void testJavaDeveloper() {
		JavaDeveloper javaDeveloper=new JavaDeveloper(new LinkedinDatabase());
		assertThat(javaDeveloper,is(notNullValue()));
	}

	@Test
	public void testGetRecruit() {
		JavaDeveloper javaDeveloper=new JavaDeveloper(new LinkedinDatabase());
		FonDeveloper developer=javaDeveloper.getRecruit();
		assertThat(developer,is(notNullValue()));
		assertThat(developer.getName(),is(equalTo("Pepe")));
		assertThat(developer.getSurname(),is(equalTo("Corredera")));
		assertThat(developer.getMinSalary(),is(equalTo(45000)));
	}

	@Test
	public void testGetActualProjects() {
		JavaDeveloper javaDeveloper=new JavaDeveloper(new LinkedinDatabase());
		assertThat(javaDeveloper.getActualProjects().size(),is(equalTo(5)));
	}

	@Test
	public void testGetActualTechnologies() {
		JavaDeveloper javaDeveloper=new JavaDeveloper(new LinkedinDatabase());
		assertThat(javaDeveloper.getActualTechnologies().size(),is(equalTo(11)));
	}

}
