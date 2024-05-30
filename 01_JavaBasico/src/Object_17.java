import java.util.ArrayList;
import java.util.List;

public class Object_17 {
    public static void main(String[] args) {
        // Se puede crear una lista que contenga diferentes tipos de datos.

        List<Object> lista = new ArrayList<Object>(); // lista de tipo Object.
        lista.add("Juan");
        lista.add(10);
        lista.add(10.5);
        lista.add(true);
        lista.add('a');
    }
}
