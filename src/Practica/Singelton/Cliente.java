package Practica.Singelton;

public class Cliente {
    public static void main(String[] args) {
        Cajero cajero = new Cajero(8596);

        Estudiante e1 = new Estudiante(cajero);
        Estudiante e2 = new Estudiante(cajero);
        Estudiante e3 = new Estudiante(cajero);
        Estudiante e4 = new Estudiante(cajero);
        Estudiante e5 = new Estudiante(cajero);

        e1.pagar(300);
        e2.pagar(250);
        e3.pagar(150);
        e4.pagar(400);
        e5.pagar(250);

        System.out.println( cajero.Consultarmonto());
    }
}
