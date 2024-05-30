package com.angeldev.clasesabstractas.form.validations;

public class NumberValidator extends Validator {
        protected String message = "El campo debe ser un numero";

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
            try {
                Integer.parseInt(value);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
}
