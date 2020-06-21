package practica5.adapter;

import java.util.Random;

public class Tablet implements AElectronicos {

    private int precio;
    private int tiempoVida;

    public Tablet(int precio, int tiempoVida) {
        this.precio = precio;
        this.tiempoVida = tiempoVida;
    }

    @Override
    public void Precio()  {
        System.out.println("El precio de la Tablet es de: " + precio);
    }

    @Override
    public void tiempoDeVida() {
        System.out.println("El tiempo de vida de la Tablet es de: " + tiempoVida );
    }

}
