package com.angeldev.clasesabstractas.form;

import com.angeldev.clasesabstractas.form.elements.*;
import com.angeldev.clasesabstractas.form.elements.select.Option;
import com.angeldev.clasesabstractas.form.validations.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
            Una clase anonima es aquella que no tiene nombre, es decir, no se le asigna un nombre al momento de
            crearla, sino que se crea una instancia de la clase padre y se implementa el metodo abstracto.
            Esto implica que no puede ser usada en otro lugar, solo en el lugar donde se crea la instancia.
        */

        ElementsForm el = new ElementsForm("greeting") {
            @Override
            public String insertHtml() {
                return "<input type='text' name='" + this.name + "' value='" + this.value + "' disabled />";
            }
        };

        InputForm username = new InputForm("username");
        InputForm password = new InputForm("password", "password");
        InputForm email = new InputForm("email", "email");
        InputForm age = new InputForm("age", "number");
        TextAreaForm experience = new TextAreaForm("experience", 8, 20);
        SelectForm languages = new SelectForm("languages");
        languages.addOption(new Option("1", "Java").isSelected())
                .addOption(new Option("2", "Python"))
                .addOption(new Option("3", "JavaScript"))
                .addOption(new Option("4", "PHP"))
                .addOption(new Option("5", "Go"));


        el.setValue("Hola que tal");
        username.setValue("angeldev");
        password.setValue("123456");
        email.setValue("angeldev@gmail.com");
        age.setValue("19");
        experience.setValue("Lorem ipsum dolor sit amet consectetur adipisicing elit. Quisquam, quibusdam.");

        List<ElementsForm> elements = List.of(el, username, password, email, age, experience, languages);

        username.addValidator(new RequiredValidator());
        password.addValidator(new RequiredValidator())
                .addValidator(new LengthValidator(6, 12));
        email.addValidator(new RequiredValidator())
                .addValidator(new EmailValidator());
        languages.addValidator(new NonNullValidator());

        elements.forEach(element -> {
            System.out.println(element.insertHtml());
            System.out.println("<br />");
        });

        elements.forEach(element -> {
            if (!element.isValid()){
                element.getErrors().forEach(error -> {
                    System.out.println("Elemento con error: " + element.getName() + " => " + error);
                });
            }
        });
    }
}