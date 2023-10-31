package BiConsumer;

public class Categoria {
    private String categoría_deporte;

    public Categoria(String categoría_deporte) {
        this.categoría_deporte = categoría_deporte;
    }

    public String getCategoría_deporte() {
        return categoría_deporte;
    }

    public void setCategoría_deporte(String categoría_deporte) {
        this.categoría_deporte = categoría_deporte;
    }

    @Override
    public String toString() {
        return "Categoría: " +
                "categoría del deporte='" + categoría_deporte;
    }
}
