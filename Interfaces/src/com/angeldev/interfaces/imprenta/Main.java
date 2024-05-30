package com.angeldev.interfaces.imprenta;

import com.angeldev.interfaces.imprenta.model.*;

public class Main {
    public static void main(String[] args) {

        Curriculum cv = new Curriculum("This is my content",
                "Angel", "Software Developer", null);

        cv.addExperience("Java");
        cv.addExperience("Python");
        cv.addExperience("C#");

        Report report = new Report("This is my report",
                "Angel", "Software Developer");

        Book book = new Book("This is my book",
                "Angel", LiteraryGenre.TECNOLOGY);

        book.addPage(new Page("Introduction"))
            .addPage(new Page("Chapter 1"))
            .addPage(new Page("Chapter 2"));


        Printable.printSheet(cv);
        Printable.printSheet(report);
        Printable.printSheet(book);
    }
}