package Decorator;

public class Client {

    public static void main (String [] sada){
        ICuenta cuenta1 = new Cuenta(200,"Pepe");
        ICuenta cuenta2 = new Cuenta(800, "Jose");

        cuenta1=new Promocion(cuenta1);
        cuenta1.showData();

        System.out.println("---------------------------------------" );

        cuenta2= new SeguroCuenta(cuenta2);
        cuenta2= new BancaInternet(cuenta2, false);
        cuenta2= new Promocion(cuenta2);
        cuenta2.showData();


    }

}
