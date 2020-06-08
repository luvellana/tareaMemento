package Ejercicios3.ej2;

public class Client {

    public static void main (String [] args){

        Organizador organizador = new Organizador();

        Persona p1 = new Persona(false, true, true);
        Persona p2 = new Persona(true, false, true);
        Persona p3 = new Persona(true, true, false);
        Persona p4 = new Persona(false, false, false);
        Persona p5 = new Persona(true, true, true);

        organizador.criteriaHandler(p1);
        System.out.println();
        organizador.criteriaHandler(p2);
        System.out.println();
        organizador.criteriaHandler(p3);
        System.out.println();
        organizador.criteriaHandler(p4);
        System.out.println();
        organizador.criteriaHandler(p5);


    }
}
