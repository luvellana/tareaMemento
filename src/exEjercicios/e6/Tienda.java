package exEjercicios.e6;

import java.util.LinkedList;
import java.util.List;

public class Tienda {

    private Estaciones strategy;
    private List<Ropa> ropa = new LinkedList<Ropa>();

    public Tienda(){}

    public void mostrarRopa(){
        List<Ropa> rs = new LinkedList<Ropa>();
        rs = this.strategy.cambiarPrecio(ropa);
        System.out.println("Ropa disponible: " );
        for(Ropa r : rs){
            System.out.println(r.getTipo()+ ", "+ r.getPrecio()  );
        }
    }

    public Estaciones getStrategy() {
        return strategy;
    }

    public void setStrategy(Estaciones strategy) {
        this.strategy = strategy;
    }

    public List<Ropa> getRopa() {
        return ropa;
    }

    public void setRopa(List<Ropa> ropa) {
        this.ropa = ropa;
    }
}
