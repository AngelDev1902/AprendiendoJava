package com.angeldev.interfaces.imprenta.model;

public class Page extends Sheet implements Printable {
    public Page(String content) {
        super(content);
    }

    @Override
    public String print() {
        return "Content: " + content + "\n";
    }
}
