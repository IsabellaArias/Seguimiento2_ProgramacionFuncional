package Supplier; //Es un proveedor de valores. Su función principal es generar y proporcionar//
// valores sin tomar ningún argumento.//

// Importa la interfaz funcional Supplier del paquete java.util.function
import java.util.function.Supplier;

// Definición de la clase genérica Nombre_Estudiante
public class Nombre_Estudiante<T> {
    // Variable de instancia para almacenar el nombre
    private T nombre;

    // Constructor que acepta un nombre y lo asigna a la variable de instancia
    public Nombre_Estudiante(T nombre) {
        this.nombre = nombre;
    }

    // Método getter para obtener el nombre almacenado en la instancia
    public T getNombre() {
        return nombre;
    }

    // Método main, punto de entrada del programa
    public static void main(String[] args) {
        // Crea una instancia de Nombre_Estudiante con tipo de parámetro String y asigna el nombre "Isabella"
        Nombre_Estudiante<String> estudiante = new Nombre_Estudiante<>("Ana Juaquina");

        // Define un Supplier que proporciona la instancia de Nombre_Estudiante
        Supplier<Nombre_Estudiante<String>> supplier = () -> estudiante;

        // Imprime el nombre almacenado en la instancia de Nombre_Estudiante obtenida a través del Supplier
        System.out.println(supplier.get().getNombre());
    }
}

