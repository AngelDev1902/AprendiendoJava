package com.angeldev.interfaces.imprenta.model;

public class Report extends Sheet implements Printable {
        private final String author;
        private final String reviser;

    public Report(String content, String author, String reviser) {
        super(content);
        this.author = author;
        this.reviser = reviser;
    }

    @Override
        public String print() {
            return "Author: " + author + "\n" +
                "Reviser: " + reviser + "\n" +
                "Content: " + content + "\n";
        }
}
