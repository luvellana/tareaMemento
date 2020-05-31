package Practica.FactoryMethod;

public class Mochila {
    private int bolsillos;
    private String tamano;

    public Mochila(int bolsillos, String tamano) {
        this.bolsillos = bolsillos;
        this.tamano = tamano;
    }

    public int getBolsillos() {
        return bolsillos;
    }

    public void setBolsillos(int bolsillos) {
        this.bolsillos = bolsillos;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
}
