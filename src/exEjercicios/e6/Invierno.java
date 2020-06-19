package exEjercicios.e6;

import java.util.LinkedList;
import java.util.List;

public class Invierno implements Estaciones {
    @Override
    public List<Ropa> cambiarPrecio(List<Ropa> e) {
        System.out.println("Percios Invierno: ");
        List<Ropa> rs = new LinkedList<Ropa>();
        for (Ropa r : e){
            int precio = r.getPrecio() + (r.getPrecio()/10);
            rs.add(new Ropa(r.getTipo(), precio));
        }
        return rs;
    }
}
