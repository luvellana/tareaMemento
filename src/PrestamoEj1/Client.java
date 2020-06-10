package PrestamoEj1;

public class Client {

    public static void main (String [] args){

        Banco o = new Banco();

        Persona p1 = new Persona("pepe", 200);

        p1.realizarPago(20, o);
        p1.realizarPago(70, o);
        p1.realizarPago(30, o);
        p1.realizarPago(80, o);

        p1.realizarPago(500, o);


    }
}
