package practica5.adapter;

import java.util.Random;

public class Refrigerador implements AElectronicos2{
    private int costo;
    private int tiempoGarantia;

    public Refrigerador(int costo, int tiempoGarantia) {
        this.costo = costo;
        this.tiempoGarantia = tiempoGarantia;
    }
    @Override

    public void Costo() {
        System.out.println("El costo del refrigerador es de: " + costo );
    }
    @Override
    public void tiempoDeGarantia() {
        System.out.println("El tiempo de garantia del refrigerador es de: " + tiempoGarantia );
    }
}
