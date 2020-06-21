package practica5.adapter;

import java.util.Random;

public class television implements AElectronicos2 {
    private int costo;
    private int tiempoGarantia;

    public television(int costo, int tiempoGarantia) {
        this.costo = costo;
        this.tiempoGarantia = tiempoGarantia;
    }
    @Override
    public void Costo() {
        System.out.println("El costo de la television es de: " + costo );
    }
    @Override
    public void tiempoDeGarantia() {
        System.out.println("El tiempo de garantia de la television es de: " + tiempoGarantia );
    }
}
