import java.util.HashMap;
import java.util.Map;

public class Mapas_18 {
    public static void main(String[] args) {
        /*
            Un mapa es una estructura de datos que almacena informacion de la forma clave-valor.
            Los mapas se utilizan para almacenar datos de forma ordenada. En direcciones de memoria contigua.
            se pueden declarar de dos formas:
                - Declaracion implicita.
                - Declaracion explicita.
        */

        // Declaracion implicita.
        Map<String, String> nombres = new HashMap<>(); // mapa de elementos de tipo String.
        // para llenar el mapa explicita, se debe hacer de la siguiente forma:
        nombres.put("Juan", "Perez");
        nombres.put("Pedro", "Gomez");
        nombres.put("Maria", "Lopez");
        nombres.put("Jose", "Garcia");
        nombres.put("Luis", "Rodriguez");

        // Recorrido con for each.
        for (String nombre : nombres.keySet()) {
            System.out.println(nombre + " " + nombres.get(nombre));
        }

        // Eliminar un elemento del mapa por su clave.
        nombres.remove("Pedro");

        // Limpiar el mapa.
        nombres.clear();
    }
}
