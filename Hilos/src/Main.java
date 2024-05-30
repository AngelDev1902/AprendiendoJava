import com.angeldev.hilos.model.FirstThread;
import com.angeldev.hilos.model.SecondThread;

public class Main {

    /*
    * Los threads o hilos de java son objetos de la clase Thread
    * que permiten que un programa realice multiples tareas simultaneamente
    * esto significa que en java pueden existir diferentes hilos ejecutandose
    * en paralelo, lo que mejora la eficiencia y la capacidad de respuesta
    * del programa
    *
    * - Proceso: Es un programa en ejecución, y cada proceso tiene su propio
    * espacio de memoria y recursos.
    * - Hilo: Es una unidad más pequeña dentro de un proceso que comparte el
    * mismo espacio de memoria y recursos con otros hilos del mismo proceso.
    *
    * la creación y gestión de hilos se realiza principalmente a través de la
    * clase Thread, que está incluida en el paquete java.lang.
    * */

    public static void main(String[] args) {
        // cuando se crea la instancia es un hilo nuevo que aun no se ejecuta ni se le asignan recursos
        FirstThread primerHilo = new FirstThread("Jhon Doe");
        Thread segundoHilo = new Thread(new SecondThread("Maria"));

        // imprimimos su estado actual (NEW) que significa que solo se ha creado
        System.out.println(primerHilo.getState()); // NEW
        System.out.println(segundoHilo.getState()); // NEW

        // se asignan recursos y comienza el ciclo de vida del hilo
        primerHilo.start();
        segundoHilo.start();

        // RUNNABLE significa que el proceso se esta ejecutando
        System.out.println(primerHilo.getState()); // RUNNABLE
        System.out.println(segundoHilo.getState()); // RUNABLE

        // implementar hilos con expresiones lambda o clases anonimas
        Runnable lambda = new Runnable() {
            @Override
            public void run() {
                // comienzo del de vida del hilo (currentThread() devuelve el nombre del hilo que se ejecuta actualmente)
                System.out.println("Se inicia el hilo " + Thread.currentThread().getName());

                // en medio se realiza alguna tarea
                try {
                    Thread.sleep(4000);
                } catch (Exception e){
                    e.printStackTrace();
                }

                // fin del ciclo de vida del hilo (currentThread() devuelve el nombre del hilo que se ejecuta actualmente)
                System.out.println("Finalizo el hilo de " + Thread.currentThread().getName());
            }
        };

        // se crea un nuevo hilo con la expresion lambda
        Thread tercerHilo = new Thread(lambda, "Luis");
        tercerHilo.start();

        // se crea un nuevo hilo con una clase anonima
        Thread cuartoHilo = new Thread(new Runnable() {
            @Override
            public void run() {
                // comienzo del de vida del hilo (currentThread() devuelve el nombre del hilo que se ejecuta actualmente)
                System.out.println("Se inicia el hilo " + Thread.currentThread().getName());

                // en medio se realiza alguna tarea
                try {
                    Thread.sleep(4000);
                } catch (Exception e){
                    e.printStackTrace();
                }

                // fin del ciclo de vida del hilo (currentThread() devuelve el nombre del hilo que se ejecuta actualmente)
                System.out.println("Finalizo el hilo de " + Thread.currentThread().getName());
            }
        }, "Pedro");

        cuartoHilo.start();

        // se crea un nuevo hilo con una expresion lambda
        Runnable quintoHilo = () -> {
            // comienzo del de vida del hilo (currentThread() devuelve el nombre del hilo que se ejecuta actualmente)
            System.out.println("Se inicia el hilo " + Thread.currentThread().getName());

            // en medio se realiza alguna tarea
            try {
                Thread.sleep(2000);
            } catch (Exception e){
                e.printStackTrace();
            }

            // fin del ciclo de vida del hilo (currentThread() devuelve el nombre del hilo que se ejecuta actualmente)
            System.out.println("Finalizo el hilo de " + Thread.currentThread().getName());
        };

        Thread sextoHilo = new Thread(quintoHilo, "Juan");
        sextoHilo.start();

        // join() se utiliza para esperar a que un hilo termine su ejecución
        // se enlaza al main con el ciclo de vida de los hilos y se ejecuta al final cuando
        // todos los hilos han terminado su ejecución
        try {
            primerHilo.join();
            segundoHilo.join();
            tercerHilo.join();
            cuartoHilo.join();
            sextoHilo.join();
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Continuando con ejecucion de main()");
    }
}