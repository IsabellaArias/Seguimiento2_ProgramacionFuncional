package BiConsumer;

// Importación de la interfaz funcional BiConsumer del paquete java.util.function
import java.util.function.BiConsumer;

// Definición de la clase principal MainGym
public class MainGym {
    // Método principal
    public static void main(String[] args) {
        // Creación de un objeto de la clase Gym con información sobre la dieta y días de entrenamiento
        Gym gym = new Gym("More protein, less carbohydrates", 6, 1);
        // Creación de un objeto de la clase GymPurpose que representa el propósito del gimnasio (en este caso, "Definition")
        GymPurpose gymPurpose = new GymPurpose("Definition");

        // Definición de un BiConsumer que establece el tipo de comida en el gimnasio basándose en el propósito del gimnasio
        BiConsumer<Gym, GymPurpose> biConsumer = (gy, pu) -> gy.setFood(pu.getPurpose());
        // Invocación del BiConsumer para establecer la comida en el gimnasio según el propósito
        biConsumer.accept(gym, gymPurpose);

        // Impresión del objetivo del gimnasio y otros detalles
        System.out.println("Gym Objective: " + gym.getFood());
        System.out.println("Days of gym: " + gym.getDays());
        System.out.println("Days of relax: " + gym.getRelaxDay());
    }
}
