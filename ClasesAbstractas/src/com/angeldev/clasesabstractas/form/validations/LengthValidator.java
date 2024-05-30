package com.angeldev.clasesabstractas.form.validations;

public class LengthValidator extends Validator {

        protected String message = "El campo debe tener una longitud entre %d y %d caracteres";
        private int min;
        private int max = Integer.MAX_VALUE;

        public LengthValidator() {
        }

        public LengthValidator(int min, int max) {
            this.min = min;
            this.max = max;
        }

        // Dos formas de validar maximos y minimos

        public void setMin(int min) {
            // manual con una expresion ternaria
            this.min = min >= 5 ? min : 0;
        }

        public void setMax(int max) {
            // con la clase Math
            this.max = Math.max(max, 10);
        }

    @Override
        public String getMessage() {
            return String.format(this.message, this.min, this.max);
        }

        @Override
        public void setMessage(String message) {
            this.message = message;

        }

        @Override
        public boolean isValid(String value) {
            this.message = String.format(this.message, this.min, this.max);

            if (value == null) {
                return true;
            }

            int length = value.length();

            return (length >= this.min && length <= this.max);
        }
}
