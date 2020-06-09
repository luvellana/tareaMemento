package strategy;

import java.util.LinkedList;
import java.util.List;

public class Client {
    public static void main(String []abx){

        Colegio context = new Colegio();
        Estudiante e1 = new Estudiante("pepe", 10);
        Estudiante e2 = new Estudiante("mari", 2);
        Estudiante e3 = new Estudiante("barbie", 5);
        Estudiante e4 = new Estudiante("mili", 7);
        Estudiante e5 = new Estudiante("jose", 6);

        List<Estudiante> l = new LinkedList<Estudiante>();
        l.add(e1);
        l.add(e2);
        l.add(e3);
        l.add(e4);
        l.add(e5);

        context.setEstudiantes(l);

        context.setStrategy(new Ordenamiento1());
        context.execute();

        context.setStrategy(new Ordenamiento2());
        context.execute();

        context.setStrategy(new Ordenamiento3());
        context.execute();


    }

}
