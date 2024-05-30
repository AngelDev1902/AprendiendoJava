package com.angeldev.clasesabstractas.form.validations;

public class RequiredValidator extends Validator {

        protected String message = "El campo es requerido";

        @Override
        public String getMessage() {
            return this.message;
        }

        @Override
        public void setMessage(String message) {
            this.message = message;

        }

        @Override
        public boolean isValid(String value) {
            return (value != null && !value.isBlank());
        }
}
