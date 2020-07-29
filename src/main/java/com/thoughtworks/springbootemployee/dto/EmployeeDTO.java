package com.thoughtworks.springbootemployee.dto;

public class EmployeeDTO {
    private int age;
    private String name;
    private String gender;
    private int companyId;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getCompanyId() {
        return companyId;
    }
}
