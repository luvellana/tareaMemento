package Practica.FactoryMethod;

public class Deportivo {
    private String talla;
    private String color;
    private int numeroprendas;

    public Deportivo(String talla, String color, int numeroprendas) {
        this.talla = talla;
        this.color = color;
        this.numeroprendas = numeroprendas;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroprendas() {
        return numeroprendas;
    }

    public void setNumeroprendas(int numeroprendas) {
        this.numeroprendas = numeroprendas;
    }
}
