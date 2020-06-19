package adapter;

import java.util.Random;

public class Electrico {
    private int Carga;
    private Random r = new Random();

    public Electrico() {

    }


    public void Cargar() {
        if(Carga <101){
            while (Carga%2 != 0){
                Carga = r.nextInt(101);
            }
        }
        System.out.println("Ahora la carga es de:"+ Carga);
    }

    public int estadoDeElectricidad() {
        return (r.nextInt(10) + 1);
    }
}
