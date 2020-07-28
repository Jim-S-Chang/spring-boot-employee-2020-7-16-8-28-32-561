package com.thoughtworks.springbootemployee.entity;

import java.util.List;

public class Company {
    private int id;
    private String name;
    private List<Employee> employees;

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Company() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
