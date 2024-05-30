import java.text.SimpleDateFormat;
import java.util.Date;

public class ClasesUtiles_13 {
    public static void main(String[] args) {
        /*
            Sin entrar a fondo en la definicion y manejo de una clase, existen algunas en Java que resultan utiles
            a la hora de trabajar. Algunas de estas clases son:
        */

        /*
        --- Clase Date ---
                La clase Date nos permite trabajar con fechas.
                Para poder utilizar esta clase, debemos importarla de la siguiente forma:
                    import java.util.Date;

                Algunos formatos de fecha son:
                    - dd/MM/yyyy: 01/01/2021
                    - dd-MM-yyyy: 01-01-2021
                    - dd.MM.yyyy: 01.01.2021
                    - dd/MMM/yyyy: 01/Ene/2021
                    - dd/MMMM/yyyy: 01/Enero/2021
                    - dd/MMMM/yyyy HH:mm:ss: 01/Enero/2021 00:00:00
                    - dd/MMMM/yyyy HH:mm:ss.SSS: 01/Enero/2021 00:00:00.000
        */
        Date fecha = new Date(); // Creamos un objeto de tipo Date.
        System.out.println(fecha); // Imprimimos la fecha actual.
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); // Creamos un objeto de tipo SimpleDateFormat.
        System.out.println(formato.format(fecha)); // Imprimimos la fecha actual con el formato que le hemos dado.

        /*
            --- Clase getTime ---
                La clase getTime nos permite obtener la fecha actual en milisegundos. Basado en el 1 de Enero de 1970.
                Al dividir el resultado entre 1000, obtenemos la fecha actual en segundos.
        */

         float tiempoInicio = fecha.getTime(); // Obtenemos la fecha actual en milisegundos

        for (int i = 0; i < 1000000000; i++) {
            // Este bucle es para que se note la diferencia entre la fecha actual en milisegundos y la fecha actual en segundos.
        }

        float tiempoFinal = fecha.getTime(); // Obtenemos la fecha actual en milisegundos

        System.out.println(tiempoFinal - tiempoInicio);

        // El tiempo que tarda en ejecutarse el bucle anterior es la diferencia entre la fecha actual despues del bucle y la fecha actual antes del bucle.

        /*
            --- Clase Math ---
                La clase Math nos permite trabajar con operaciones matematicas.
                Para poder utilizar esta clase, debemos importarla de la siguiente forma:
                    import java.lang.Math;

                Algunos metodos de la clase Math son:
                    - Math.abs(): Devuelve el valor absoluto de un numero.
                    - Math.ceil(): Devuelve el entero mas pequeño mayor o igual que un numero. (Redondeo hacia arriba)
                    - Math.floor(): Devuelve el entero mas grande menor o igual que un numero. (Redondeo hacia abajo)
                    - Math.pow(): Devuelve la potencia de un numero.
                    - Math.sqrt(): Devuelve la raiz cuadrada de un numero.
                    - Math.random(): Devuelve un numero aleatorio entre 0 y 1.
                    - Math.round(): Devuelve el valor de un numero redondeado al entero mas cercano. (Redondeo normal)
                    - Math.max(): Devuelve el numero mas grande de una serie de numeros.
                    - Math.min(): Devuelve el numero mas pequeño de una serie de numeros.
                    - Math.PI: Devuelve el valor de PI.
                    - Math.E: Devuelve el valor de E.
                    - Math.exp(): Devuelve el valor de E elevado a un numero.
                    - Math.log(): Devuelve el logaritmo natural de un numero.
                    - Math.log10(): Devuelve el logaritmo en base 10 de un numero.
                    - Math.sin(): Devuelve el seno de un numero.
                    - Math.cos(): Devuelve el coseno de un numero.
                    - Math.tan(): Devuelve la tangente de un numero.
                    - Math.asin(): Devuelve el arcoseno de un numero.
                    - Math.acos(): Devuelve el arcocoseno de un numero.
                    - Math.atan(): Devuelve el arcotangente de un numero.
                    - Math.toDegrees(): Convierte un numero de radianes a grados.
                    - Math.toRadians(): Convierte un numero de grados a radianes.
        */

        /*
            --- Clase System ---

                La clase System nos permite trabajar con las propiedades del sistema. (Variables de entorno, propiedades del sistema, etc.)
                Para poder utilizar esta clase, debemos importarla de la siguiente forma:
                    import java.lang.System;

                Algunos metodos de la clase System son:
                    - System.out.println(): Imprime un mensaje por pantalla.
                    - System.out.print(): Imprime un mensaje por pantalla.
                    - System.err.println(): Imprime un mensaje de error por pantalla.
                    - System.err.print(): Imprime un mensaje de error por pantalla.
                    - System.exit(): Finaliza la ejecucion del programa.
                    - System.currentTimeMillis(): Devuelve la fecha actual en milisegundos.
                    - System.gc(): Llama al recolector de basura.
                    - System.getenv(): Devuelve el valor de una variable de entorno.
                    - System.getProperties(): Devuelve las propiedades del sistema.
                    - System.getProperty(): Devuelve el valor de una propiedad del sistema.
                    - System.setProperties(): Establece las propiedades del sistema.
                    - System.setProperty(): Establece el valor de una propiedad del sistema.
                    - System.console(): Devuelve un objeto de tipo Console.
                    - System.runFinalization(): Llama al metodo finalize() de todos los objetos que esten pendientes de ser eliminados.
                    - System.runFinalizersOnExit(): Establece si se deben llamar a los metodos finalize() de los objetos que esten pendientes de ser eliminados.
                    - System.load(): Carga una libreria nativa.
                    - System.loadLibrary(): Carga una libreria nativa.
                    - System.mapLibraryName(): Devuelve el nombre de una libreria nativa.
                    - System.setErr(): Establece el flujo de salida de error.
                    - System.setIn(): Establece el flujo de entrada.
                    - System.setOut(): Establece el flujo de salida.
                    - System.setSecurityManager(): Establece el gestor de seguridad.
                    - System.getSecurityManager(): Devuelve el gestor de seguridad.

                    * System.getProperty("user.name"); Devuelve el nombre del usuario.
                    * System.getProperty("user.home"); Devuelve el directorio del usuario.
                    * System.getProperty("user.dir"); Devuelve el directorio de trabajo.
        */

        /*
            Ejecutar programas externos desde Java.
        */

        Runtime r = Runtime.getRuntime(); // Creamos un objeto de tipo Runtime.
        Process proceso; // Creamos un objeto de tipo Process.

        try {
            if (System.getProperty("os.name").startsWith("Nux") ||
                    System.getProperty("os.name").startsWith("Nix")){
                proceso = r.exec("code"); // Ejecutamos el programa gedit.
            } else if (System.getProperty("os.name").startsWith("Windows")){
                proceso = r.exec("code"); // Ejecutamos el programa notepad.
            } else {
                proceso = r.exec("code"); // Ejecutamos el programa gedit.
            }

            proceso.waitFor(); // Esperamos a que el programa se cierre.
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
