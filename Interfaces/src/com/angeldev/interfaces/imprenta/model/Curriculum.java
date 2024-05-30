package com.angeldev.interfaces.imprenta.model;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Sheet implements Printable {
    private final String name;
    private final String profession;
    private List<String> experiences;

    public Curriculum(String content, String name, String profession, List<String> experiences) {
        super(content);
        this.name = name;
        this.profession = profession;
        this.experiences = experiences;
        this.experiences = new ArrayList<>();
    }

    public Curriculum addExperience(String experience) {
        experiences.add(experience);
        return this;
    }

    @Override
    public String print() {
        StringBuilder sb = new StringBuilder("Name: ")
                .append(name)
                .append("\nProfession: ")
                .append(profession)
                .append("\nExperiences: \n");

        for (String experience : experiences) {
            sb.append("- ")
                .append(experience)
                .append("\n");
        }

        sb.append("Content: ")
            .append(content);

        return sb.toString();
    }
}
