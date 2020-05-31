package Practica.Singelton;

public class Ventanilla {
    private static Ventanilla instance=null;
    private int monto ;
    private int codigoCajero;

    public Ventanilla(int codigoCajero) {
        monto=0;
        this.codigoCajero = codigoCajero;
    }
    private synchronized static void makeInstance(int cajero){
        if (instance==null)
            instance = new Ventanilla(cajero);
    }
    public static Ventanilla getInstance(int cajero) {
        if (instance==null) {
            makeInstance(cajero);
        }
        return instance;
    }


    public int getMonto() {
        return monto;
    }

    public int getCodigoCajero() {
        return codigoCajero;
    }

    public void recibirPago(int cantidad){
        monto=monto+cantidad;

    }
}
