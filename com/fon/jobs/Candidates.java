package com.fon.jobs;

import java.util.List;

public abstract class Candidates {

    public abstract void select(String columns);

    public abstract void from(String tables);

    public abstract void where(String criteria);

    public abstract void orderBy(List<String> order);

    public abstract void limit(int limit);

    public abstract FonDevelopper execute();
}
