package practica5.visitor;

public class Client {

    public static void main (String []args  ){
        Gato g1 = new Gato("Bola de nieve");
        Gato g2 = new Gato("Bola de nieve 2");

        Perro p1 = new Perro("Goffy");
        Perro p2 = new Perro("Max");

        Caballo c1 = new Caballo("Capitan");
        Caballo c2 = new Caballo("BoJack");
    }
}
