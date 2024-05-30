package com.angeldev.clasesabstractas.form.elements;

import com.angeldev.clasesabstractas.form.elements.select.Option;

import java.util.ArrayList;
import java.util.List;

/*
    Select es un elemento que permite seleccionar una opcion de un conjunto de opciones desplegables
*/

public class SelectForm extends ElementsForm {

    // Establecemos una lista de las opciones que contendra el select
    private List<Option> options;

    // Constructor que inicializa la lista como vacia
    public SelectForm(String name) {
        super(name);
        this.options = new ArrayList<>();
    }

    // Constructor que recibe el nombre y la lista de opciones
    public SelectForm(String name, List<Option> options) {
        super(name);
        this.options = options;
    }

    // Metodo que permite agregar una opcion a la lista de opciones
    public SelectForm addOption(Option option) {
        this.options.add(option);
        return this;
    }

    @Override
    public String insertHtml() {
        // Creamos un StringBuilder para ir agregando las opciones del select e iniciamos con el tag select
        StringBuilder sb = new StringBuilder("<select name='" + this.name + "'>");

        // Recorremos la lista de opciones y vamos agregando cada una de ellas al StringBuilder
        for (Option option : this.options) {
            sb.append("\n<option ");
            if (option.getSelected()) {
                sb.append("selected");
            }
            sb.append(" value='").append(option.getValue()).append("'>")
                    .append(option.getName())
                    .append("</option>");
        }

        // Cerramos el tag select
        sb.append("\n</select>");

        return sb.toString();
    }
}
