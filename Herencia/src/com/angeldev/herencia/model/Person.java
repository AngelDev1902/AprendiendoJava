package com.angeldev.herencia.model;

public abstract class Person {
    private String name;
    private String firstLastName;
    private String secondLastName;
    private int age;

    public Person(String name, String firstLastName, String secondLastName, int age) {
        this.name = name;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public void setFirstLastName(String firstLastName) {
        this.firstLastName = firstLastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("name='").append(name).append('\'');
        sb.append(", firstLastName='").append(firstLastName).append('\'');
        sb.append(", secondLastName='").append(secondLastName).append('\'');
        sb.append(", age=").append(age);

        return sb.toString();
    }
}
