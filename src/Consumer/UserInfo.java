package Consumer;

// Importación de las clases necesarias del paquete java.util
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

// Definición de la clase UserInfo
public class UserInfo {
    // Método principal
    public static void main(String[] args) {
        // Creación de una lista de usuarios utilizando la clase ArrayList del framework de colecciones
        List<User> users = new ArrayList<>();
        // Agregar objetos de la clase User a la lista
        users.add(new User("ChrisYes ", 5));
        users.add(new User("Jhonny21 ", 32));
        users.add(new User("Isa534 ", 0));
        users.add(new User("XxPinzonxX ", 2));
        users.add(new User("Graph121 ", 1));

        // Definición de un objeto Consumer que imprimirá los detalles de los usuarios
        Consumer<List<User>> consumer = (userList) -> {
            // Iterar a través de la lista de usuarios y mostrar sus nombres y cantidad de juegos
            for (User user : userList) {
                System.out.println(user.getNameTag() + "-" + user.getGames());
            }
        };

        // Invocar el método accept del objeto Consumer con la lista de usuarios como argumento
        consumer.accept(users);
    }
}
