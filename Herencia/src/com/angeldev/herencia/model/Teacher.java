package com.angeldev.herencia.model;

import java.util.ArrayList;

public class Teacher extends Person{
    private String idTeacher;
    private ArrayList<String> courses = new ArrayList<>();

    public Teacher(String name, String firstLastName, String secondLastName, int age, String idTeacher, ArrayList<String> courses) {
        super(name, firstLastName, secondLastName, age);
        this.idTeacher = idTeacher;
        this.courses = courses;
    }

    public String getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(String idTeacher) {
        this.idTeacher = idTeacher;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Teacher{");
        sb.append(super.toString());
        sb.append("idTeacher='").append(idTeacher).append('\'');
        sb.append(", courses=").append(courses);
        sb.append('}');
        return sb.toString();
    }
}
