import javax.swing.*;
import com.angeldev.excepciones.model.*;

public class Main {
    public static void main(String[] args) {
        /*
            Las excepciones son errores que ocurren en tiempo de ejecución. El manejo de estas excepciones
            nos permite controlar el flujo de nuestro programa y evitar que se detenga abruptamente.

            Para manejar las excepciones utilizamos los bloques try-catch. Dentro del bloque try se coloca
            el código que puede generar una excepción. Dentro del bloque catch se coloca el código que se
            ejecutará en caso de que se genere una excepción.
        */

        Calculadora cal = new Calculadora();

        String numerador = JOptionPane.showInputDialog("ingrese un entero numerador:");
        String denominador = JOptionPane.showInputDialog("ingrese un entero denominador:");

        try {
            double division2 = cal.dividir(numerador, denominador);
            System.out.println("division2 = " + division2);
        } catch(FormatoNumeroExcepcion e){
            System.out.println("Se detecto una excepción: ingrese un número válido: " + e.getMessage());
            e.printStackTrace(System.out);
        }
        catch(DivisionPorCeroExcepcion ae){
            System.out.println("Capturamos la excepcion en tiempo de ejecución: " + ae.getMessage());
            main(args);
        } finally {
            System.out.println("Es opcional, pero se ejecuta siempre con excepción o sin!");
        }
        System.out.println("Continuamos con el flujo de nuestra aplicación!");

    }
}