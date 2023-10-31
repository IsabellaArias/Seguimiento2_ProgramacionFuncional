package BiConsumer;

public class Deportes {
    private String nombre;
    private String categoría;
    private Integer cantidad_jugadores;

    public Deportes(String nombre, String categoría, Integer cantidad_jugadores) {
        this.nombre = nombre;
        this.categoría = categoría;
        this.cantidad_jugadores = cantidad_jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }

    public Integer getCantidad_jugadores() {
        return cantidad_jugadores;
    }

    public void setCantidad_jugadores(Integer cantidad_jugadores) {
        this.cantidad_jugadores = cantidad_jugadores;
    }
}

