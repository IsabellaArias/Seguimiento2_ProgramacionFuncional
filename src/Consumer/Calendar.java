package Consumer;

// Importación de las clases necesarias
import java.text.SimpleDateFormat;
import java.util.function.Consumer;
import java.util.Date;


// Definición de la clase Calendar
public class Calendar {
    // Método principal
    public static void main(String[] args) {
        // Creación de un Consumer para imprimir un mensaje de bienvenida con el nombre proporcionado
        Consumer<String> welcome = name -> {
            System.out.println("Welcome " + name + " we are in:");
        };
        // Invocar el método accept del Consumer con el nombre "Carlos"
        welcome.accept("Carlos");

        // Creación de un Consumer para imprimir la fecha actual formateada como "dd-MM-yyyy"
        Consumer<Date> consumer = date -> {
            // Creación de un objeto SimpleDateFormat para formatear la fecha
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            // Imprimir la fecha formateada utilizando el objeto SimpleDateFormat
            System.out.println(dateFormat.format(date));
        };
        // Invocar el método accept del Consumer con la fecha actual
        consumer.accept(new Date());
    }
}
