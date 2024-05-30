package com.angeldev.clasesabstractas.form.elements;

/*
    Un tipo de elemento que puede ser utilizado en un formulario son los inputs, los cuales pueden ser de
    diferentes tipos, como por ejemplo: text, password, email, etc.
*/

public class InputForm extends ElementsForm {

    // Establecemos el tipo de input que sera por defecto
    private String type = "text";

    // Un constructor vacio que creara por defecto un input de tipo text
    public InputForm(String name) {
        super(name);
    }

    // Un constructor que recibe el nombre y el tipo de input que se desea crear
    public InputForm(String name, String type) {
        super(name);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String insertHtml() {
        return "<input type='" + this.type + "' name='" + this.name + "' value='" + this.value + "' />";
    }
}
