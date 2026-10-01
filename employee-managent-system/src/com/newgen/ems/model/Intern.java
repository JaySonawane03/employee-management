package com.newgen.ems.model;

public class Intern extends Employee{

    private String mentorName;

    public Intern(int id, String name, String department, double baseSalary, String mentorName) {
        super(id, name, department, baseSalary);
        this.mentorName = name;
    }

    public String getMentorName() {
        return mentorName;
    }

    @Override
    public String designation() {
        return "Intern";
    }



}
