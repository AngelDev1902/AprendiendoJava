import com.angeldev.recursividad.model.Componente;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Componente pc = new Componente("PC");
        Componente cpu = new Componente("CPU");
        Componente monitor = new Componente("Monitor");
        Componente teclado = new Componente("Teclado");
        Componente mouse = new Componente("Mouse");
        Componente ram = new Componente("RAM");
        Componente hdd = new Componente("HDD");
        Componente gpu = new Componente("GPU");
        Componente cooler = new Componente("Cooler");
        Componente ventilador = new Componente("Ventilador");
        Componente placaMadre = new Componente("Placa Madre");
        Componente fuente = new Componente("Fuente");

        pc
                .addHijo(cpu)
                .addHijo(monitor)
                .addHijo(teclado)
                .addHijo(mouse);

        cpu
                .addHijo(ram)
                .addHijo(hdd)
                .addHijo(gpu)
                .addHijo(cooler)
                .addHijo(ventilador)
                .addHijo(placaMadre)
                .addHijo(fuente);

        metodoRecursivoStream(pc, 0).forEach(componente -> System.out.println("\t".repeat(componente.getNivel()) + componente.getNombre()));
    }

    public static Stream<Componente> metodoRecursivoStream(Componente componente, int nivel) {
        componente.setNivel(nivel);

        return Stream.concat(
                Stream.of(componente),
                componente.getHijos().stream().flatMap(hijo -> metodoRecursivoStream(hijo, nivel + 1))
        );
    }

    public static void metodoRecursivo(Componente componente, int nivel) {
        System.out.println("\t".repeat(nivel) + componente.getNombre());
        if (componente.tieneHijos()) {
            for (Componente hijo : componente.getHijos()) {
                metodoRecursivo(hijo, nivel + 1);
            }
        }
    }
}