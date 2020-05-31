package Practica.Singelton;

public class Estudiante {

    private Cajero cajero;

    public Estudiante(Cajero cajero) {
        this.cajero = cajero;
    }
    public void pagar(int monto){cajero.recibirPago(monto);}
}
