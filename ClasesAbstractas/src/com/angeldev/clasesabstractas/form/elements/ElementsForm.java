package com.angeldev.clasesabstractas.form.elements;
import com.angeldev.clasesabstractas.form.validations.Validator;

import java.util.ArrayList;
import java.util.List;

/*
    Una clase abstracta es aquella que solo funciona como clase padre, es decir, solo puede ser heredada
    por otras clases y no puede ser instanciada
*/
abstract public class ElementsForm {

    /*
        Definimos las propiedades que tiene cualquier elemento de un formulario
        en html, es decir, un valor y un nombre
    */
    protected String name;
    protected String value;

    private List<Validator> validators;
    private List<String> errors;

    public ElementsForm() {
        this.validators = new ArrayList<>();
        this.errors = new ArrayList<>();
    }

    public ElementsForm(String name) {
        this();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ElementsForm addValidator(Validator validator) {
        this.validators.add(validator);
        return this;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isValid() {
        for (Validator validator : this.validators) {
            if (!validator.isValid(this.value)) {
                this.errors.add(validator.getMessage());
            }
        }
        return this.errors.isEmpty();
    }

    /*
        Una clase abstracta que contiene a su vez un metodo abstracto establece como regla obligatoria
        que las clases hijas implementen dicho metodo dependiendo de sus necesidades
    */
    abstract public String insertHtml();

}
