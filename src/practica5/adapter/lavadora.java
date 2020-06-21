package practica5.adapter;

import java.util.Random;

public class lavadora implements AElectronicos2{

        private int costo;
        private int tiempoGarantia;

        public lavadora(int costo, int tiempoGarantia) {
            this.costo = costo;
            this.tiempoGarantia = tiempoGarantia;
        }

        @Override
        public void Costo() {
            System.out.println("El costo de la lavadora es de: " + costo );
        }

        @Override
        public void tiempoDeGarantia() {
            System.out.println("El tiempo de garantia de la lavadora es de: " + tiempoGarantia );
        }
    }
