package com.angeldev.interfaces.imprenta.model;

/*
    Libro no es una hoja, por lo tanto no hereda de Sheet
    pero si implementa la interfaz Printable
*/

import java.util.ArrayList;
import java.util.List;

public class Book implements Printable {
    private List<Printable> pages;
    private String title;
    private String author;
    private LiteraryGenre genre;

    public Book(String title, String author, LiteraryGenre genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pages = new ArrayList<>();
    }

    public Book addPage(Printable page) {
        pages.add(page);
        return this;
    }

    public String print() {
        StringBuilder sb = new StringBuilder("Title: ")
                .append(title)
                .append("\nAuthor: ")
                .append(author)
                .append("\nGenre: ")
                .append(genre)
                .append("\nPages: \n");

        for (Printable page : pages) {
            sb.append("- ")
                .append(page.print())
                .append("\n");
        }

        return sb.toString();
    }
}
