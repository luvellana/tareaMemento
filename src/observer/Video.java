package observer;

public class Video {
    private String tipo;
    private String titulo;
    private int tiempoMinutos;
    private String categoría;

    public Video(String tipo, String titulo, int tiempoMinutos, String categoría) {
        this.tipo = tipo;
        this.titulo = titulo;
        this.tiempoMinutos = tiempoMinutos;
        this.categoría = categoría;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCategoría() {
        return categoría;
    }
}
