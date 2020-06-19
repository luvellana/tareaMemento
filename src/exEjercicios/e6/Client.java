package exEjercicios.e6;

import java.util.LinkedList;
import java.util.List;

public class Client {
    public static void main(String []abx){

        Tienda context = new Tienda();
        Estaciones p = new Primavera();
        Estaciones v = new verano();
        Estaciones o = new Otonio();
        Estaciones i = new Invierno();

        Ropa r1 = new Ropa("jean", 100);
        Ropa r2 = new Ropa("polera", 200);
        Ropa r3 = new Ropa("blusa", 50);
        Ropa r4 = new Ropa("pantalon", 70);
        Ropa r5 = new Ropa("chamarra", 60);

        List<Ropa> l = new LinkedList<Ropa>();
        l.add(r1);
        l.add(r2);
        l.add(r3);
        l.add(r4);
        l.add(r5);

        context.setRopa(l);

        context.setStrategy(p);
        context.mostrarRopa();
        context.setStrategy(v);
        context.mostrarRopa();
        context.setStrategy(o);
        context.mostrarRopa();
        context.setStrategy(i);
        context.mostrarRopa();
        context.setStrategy(p);
        context.mostrarRopa();


    }

}
