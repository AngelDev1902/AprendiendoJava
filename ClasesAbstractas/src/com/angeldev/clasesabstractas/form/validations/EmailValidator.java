package com.angeldev.clasesabstractas.form.validations;

public class EmailValidator extends Validator {

        protected String message = "El campo debe ser un email";
        private final static String EMAIL_REGEX = "^(.+)@(.+)$";

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
            return value.matches(EMAIL_REGEX);
        }
}
