package practica5.visitor;

public class Client {

    public static void main (String []args  ){
        Gato g1 = new Gato("Bola de nieve");
        Gato g2 = new Gato("Bola de nieve 2");

        Perro p1 = new Perro("Goffy");
        Perro p2 = new Perro("Max");

        Caballo c1 = new Caballo("Capitan");
        Caballo c2 = new Caballo("BoJack");

        g1.Enfermedad("enfermedad1");
        g2.Enfermedad("enfermedad2");
        p1.Enfermedad("enfermedad2");
        p2.Enfermedad("enfermedad1");
        c1.Enfermedad("enfermedad2");
        c2.Enfermedad("enfermedad1");

        Veterinario v = new Veterinario();

        g1.accept(v);
        g2.accept(v);
        p1.accept(v);
        p2.accept(v);
        c1.accept(v);
        c2.accept(v);


    }
}
