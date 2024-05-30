package com.angeldev.herencia.model;

public class Student extends Person{
    private String idStudent;
    private int semester;
    private int average;

    public Student(String name, String firstLastName, String secondLastName, int age, String idStudent, int semester, int average) {
        super(name, firstLastName, secondLastName, age);
        this.idStudent = idStudent;
        this.semester = semester;
        this.average = average;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append(super.toString());
        sb.append("idStudent='").append(idStudent).append('\'');
        sb.append(", semester=").append(semester);
        sb.append(", average=").append(average);
        sb.append('}');

        return sb.toString();
    }
}
