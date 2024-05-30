import com.angeldev.javaanotaciones.model.Producto;
import com.angeldev.javaanotaciones.model.Procesador;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto();
        producto.setFecha(LocalDate.now());
        producto.setNombre("Mesa de centro");
        producto.setPrecio("1000L");

        System.out.println(Procesador.convertirAJson(producto));
    }
}