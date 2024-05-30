package com.angeldev.clasesabstractas.form.elements;

/*
    Otro tipo de elemento que puede ser utilizado en un formulario es el textarea, el cual es un elemento
    que permite ingresar texto de manera multilinea, es decir una gran cantidad de texto
*/

public class TextAreaForm extends ElementsForm {

    /*
        Las principales caracteristicas de un textarea son las siguientes:
        - rows: numero de filas que tendra el textarea
        - cols: numero de columnas que tendra el textarea
    */
    private int rows;
    private int cols;

    public TextAreaForm(String name) {
        super(name);
    }

    public TextAreaForm(String name, int rows, int cols) {
        super(name);
        this.rows = rows;
        this.cols = cols;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    @Override
    public String insertHtml() {
        return "<textarea name='" + this.name + "' rows='" + this.rows + "' cols='" + this.cols + "'>" + this.value + "</textarea>";
    }
}
