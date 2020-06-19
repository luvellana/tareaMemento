package adapter;

public class Client {

    public static void main (String [] args){

        Electrico adaptee = new Electrico();

        ElectricoAdapter ElectricoA= new ElectricoAdapter(adaptee);

        ElectricoA.llenarGasolina(10);
        System.out.println( "Estado: " +ElectricoA.estadoCombustible());

        Gasolina gasolina= new Gasolina();
        gasolina.llenarGasolina(30);
        gasolina.estadoCombustible();
        System.out.println("Estado: " +gasolina.estadoCombustible());


    }


}
