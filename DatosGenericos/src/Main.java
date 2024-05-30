import com.angeldev.datosgenericos.model.Generic;
import com.angeldev.datosgenericos.model.RestricterGeneric;

import java.awt.geom.RectangularShape;

public class Main {
    public static void main(String[] args) {
        /*
        * Aqui se ectablece el tipo de dato con el que se va a trabajar, en este caso es String, y por tanto
        * es necesario mandar un parametro de tipo String al constructor de la clase Generic.
        * */
        Generic<String> stringGeneric = new Generic<>("Hello World");
        stringGeneric.viewType();

        Generic<Integer> integerGeneric = new Generic<>(10);
        integerGeneric.viewType();

        RestricterGeneric<Integer> integerRestricterGeneric = new RestricterGeneric<>(10);
        integerRestricterGeneric.viewType();

        RestricterGeneric<Double> doubleRestricterGeneric = new RestricterGeneric<>(10.0);
        doubleRestricterGeneric.viewType();

        Generic<Character> charGeneric = new Generic<>('a');
        Integer numberReturn = charGeneric.genericMethod(10, 10.0);
    }
}