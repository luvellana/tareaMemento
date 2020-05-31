package Practica.FactoryMethod;

public class KitColegial implements IKit{
    private Mochila mochila;
    private Libro libro;
    private Computadora compu;

    public KitColegial() {
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Computadora getCompu() {
        return compu;
    }

    public void setCompu(Computadora compu) {
        this.compu = compu;
    }

    @Override
    public void action() {
        System.out.println("Se creo un kit colegial que contiene una mochila tamano " + mochila.getTamano() + "con " + mochila.getBolsillos() + "bolsillos, etc");
    }
}
