package Practica.FactoryMethod;

public class KitEscolar implements IKit {
    private Mochila mochila;
    private Deportivo deportivo;
    private Cuadernos cuaderno;

    public KitEscolar() {
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Deportivo getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(Deportivo deportivo) {
        this.deportivo = deportivo;
    }

    public Cuadernos getCuaderno() {
        return cuaderno;
    }

    public void setCuaderno(Cuadernos cuaderno) {
        this.cuaderno = cuaderno;
    }

    @Override
    public void action() {
        System.out.println("Se creo un kit Escolar que contiene una mochila tamano " + mochila.getTamano() + "con " + mochila.getBolsillos() + "bolsillos, etc");
    }
}
