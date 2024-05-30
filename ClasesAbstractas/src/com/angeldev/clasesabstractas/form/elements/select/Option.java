package com.angeldev.clasesabstractas.form.elements.select;

public class Option {
    private String value;
    private String name;
    private boolean selected;

    public Option() {}

    public Option(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Option isSelected() {
        selected = true;
        return this;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public boolean getSelected() {
        return selected;
    }
}
