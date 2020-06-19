package exEjercicios.e6;

public class Ropa {
    private String tipo;
    private int precio;

    public Ropa(String nombre, int promedio) {
        this.tipo = nombre;
        this.precio = promedio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
