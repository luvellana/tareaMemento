package practica5.adapter;

public class Client {

    public static void main (String [] args){

        AElectronicos2 adaptee = new television(20, 30);
        Electronico2Adapter ElectricoA= new Electronico2Adapter(adaptee);

        AElectronicos2 adaptee1 = new television(25, 40);
        Electronico2Adapter ElectricoA1= new Electronico2Adapter(adaptee1);

        AElectronicos2 adaptee2 = new television(35, 20);
        Electronico2Adapter ElectricoA2= new Electronico2Adapter(adaptee2);


        ElectricoA.Precio();
        ElectricoA.tiempoDeVida();

        ElectricoA1.Precio();
        ElectricoA1.tiempoDeVida();

        Tablet gasolina= new Tablet(40,50);
        gasolina.Precio();
        gasolina.tiempoDeVida();

    }


}
