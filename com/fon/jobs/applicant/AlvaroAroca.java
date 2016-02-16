package com.fon.jobs.applicant;

import com.fon.jobs.JavaDeveloper;

public class AlvaroAroca extends JavaDeveloper {
    public String name = "Álvaro";
    public String surname = "Aroca Muñoz";

    public String address = "Mairena del Aljarafe, Sevilla";

    private String email = "alvaro.aroca.m@gmail.com";

    @Override
    public List<String> getActualTechnologies() {
        List<String> techs = new ArrayList<>();
        techs.add("Java 7-8");
        techs.add("Tomcat");
        techs.add("Spring MVC");
        techs.add("Spring Spring");
        techs.add("Struts 2");
        techs.add("Sql   - Mysql");
        techs.add("Git");
        techs.add("Eclipse");
        techs.add("Maven");
        techs.add("Continuous Integration - Jenkins, Sonarqube");
        techs.add("jQuery");
        techs.add("Bootstrap");
        techs.add("Foundation");
        techs.add("Objective-C");
        techs.add("Cordova");
        techs.add("AWS");

        return techs;
    }

    public List<String> getInProgressTechnologies() {
        List<String> techs = new ArrayList<>();

        techs.add("Node.js");
        techs.add("Javascript");

        return techs;
    }

    protected List<String> getSocial() {
        List<String> social = new ArrayList<>();

        social.add("https://www.linkedin.com/in/aaroca");
        social.add("https://github.com/aaroca");
        social.add("https://twitter.com/aarocatwitt");

        return social;
    }
}