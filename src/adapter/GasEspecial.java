package adapter;

import java.util.Random;

public class GasEspecial implements IAuto{
    private int capacidad;
    private Random r = new Random();

    public GasEspecial() {
        capacidad = r.nextInt(101);
    }

    @Override
    public void llenarGasolina(int x) {
        capacidad += x;
        if(capacidad<101){
            capacidad=100;
        }
        System.out.println("se lleno el tanque");
    }

    @Override
    public int estadoCombustible() {
        return capacidad;
    }
}
