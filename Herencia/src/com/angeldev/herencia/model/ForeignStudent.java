package com.angeldev.herencia.model;

public class ForeignStudent extends Student{
    private String country;
    private String institute;

    public ForeignStudent(String name, String firstLastName, String secondLastName, int age, String idStudent, int semester, int average, String country, String institute) {
        super(name, firstLastName, secondLastName, age, idStudent, semester, average);
        this.country = country;
        this.institute = institute;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ForeignStudent{");
        sb.append(super.toString());
        sb.append("country='").append(country).append('\'');
        sb.append(", institute='").append(institute).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
