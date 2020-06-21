package practica5.adapter;

import java.util.Random;

public class Celular implements AElectronicos {
    private int precio;
    private int tiempoVida;

    public Celular(int precio, int tiempoVida) {
        this.precio = precio;
        this.tiempoVida = tiempoVida;
    }

    @Override
    public void Precio()  {
        System.out.println("El precio del Celular es de: " + precio);
    }

    @Override
    public void tiempoDeVida() {
        System.out.println("El tiempo de vida del Celular es de: " + tiempoVida );
    }
}
