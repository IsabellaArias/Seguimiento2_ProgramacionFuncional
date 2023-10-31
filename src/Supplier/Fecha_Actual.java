package Supplier;

// Importa la interfaz funcional Supplier del paquete java.util.function
import java.util.function.Supplier;

// Importa la clase Date del paquete java.util para manejar fechas//
import java.util.Date;

// Definición de la clase Fecha_Actual
public class Fecha_Actual {
    // Método principal del programa
    public static void main(String[] args) {
        // Crea un Supplier que generará instancias de Date usando el constructor predeterminado (Date::new)
        Supplier<Date> FechaDeHoy = Date::new;

        // Obtiene la fecha actual invocando el método get() del Supplier
        Date fechaActual = FechaDeHoy.get();

        // Imprime la fecha actual en la consola junto con un mensaje descriptivo
        System.out.println("Fecha actual: " + fechaActual);
    }
}