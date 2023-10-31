package BiConsumer;

// Importación de la interfaz funcional BiConsumer del paquete java.util.function
import java.util.function.BiConsumer;

// Definición de la clase principal MainDeportes
public class MainDeportes {
    // Método principal
    public static void main(String[] args) {
        // Creación de un objeto de la clase Deportes con información sobre el deporte y cantidad de jugadores
        Deportes deportes = new Deportes("Baloncesto", "x", 10);
        // Creación de un objeto de la clase Categoría que representa la categoría del deporte (en este caso, "Normal")
        Categoria categoria = new Categoria("Colectivo");

        // Definición de un BiConsumer que establece la categoría del deporte basándose en la categoría proporcionada
        BiConsumer<Deportes, Categoria> biConsumer = (depo, cate) -> depo.setCategoría(cate.getCategoría_deporte());
        // Invocación del BiConsumer para establecer la categoría del deporte
        biConsumer.accept(deportes, categoria);

        // Impresión del nombre del deporte, cantidad de jugadores y categoría del deporte
        System.out.println("Nombre: " + deportes.getNombre()); // Imprime el nombre del deporte
        System.out.println("Cantidad de Jugadores: " + deportes.getCantidad_jugadores()); // Imprime la cantidad de jugadores
        System.out.println("Categoría: " + deportes.getCategoría()); // Imprime la categoría del deporte
    }
}
