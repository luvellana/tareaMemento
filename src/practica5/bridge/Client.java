package practica5.bridge;


public class Client {
    public static void main (String [] args){

        Euro euro = new Euro();
        Dolar dolar = new Dolar();

        Cuenta ahorro = new Ahorro(dolar);
        Cuenta pf = new PlazoFijo(euro);

        ahorro.depositar(100);
        pf.depositar(200);


    }
}
