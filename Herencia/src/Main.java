import com.angeldev.herencia.model.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Al ser una clase abstracta no se puede instanciar
        // Person p = new Person("Luis", "Vivar", "Tovar", 19);

        // Se crea un objeto de tipo Student
        Student s = new Student("Luis", "Vivar", "Tovar", 19, "2016630552", 3, 90);
        System.out.println(s.toString());

        // Se crea un objeto de tipo Teacher
        ArrayList<String> courses = new ArrayList<>();
        courses.add("POO");
        courses.add("Estructura de datos");
        Teacher t = new Teacher("Angel", "Vivar", "Tovar", 19, "2016630552", courses);
        System.out.println(t.toString());

        // Se crea un objeto de tipo ForeignStudent
        ForeignStudent fs = new ForeignStudent("Luis", "Vivar", "Tovar", 19, "2016630552", 3, 90, "Mexico", "UABC");
        System.out.println(fs.toString());
    }
}