package practica5.adapter;

import java.util.Random;

public class computadora implements AElectronicos {
    private int precio;
    private int tiempoVida;

    public computadora(int precio, int tiempoVida) {
        this.precio = precio;
        this.tiempoVida = tiempoVida;
    }

    @Override
    public void Precio()  {
        System.out.println("El precio de la computadora es de: " + precio);
    }

    @Override
    public void tiempoDeVida() {
        System.out.println("El tiempo de vida de la computadora es de: " + tiempoVida );
    }
}
