package Practica.Singelton;

public class Cajero {
        private int codigo;
        private Ventanilla ventanilla ;

    public Cajero(int codigo) {
        this.codigo = codigo;
        ventanilla = Ventanilla.getInstance(codigo);
    }

    public void recibirPago (int monto){
        ventanilla.recibirPago(monto);
    }
    public int Consultarmonto(){ return ventanilla.getMonto();}
    public int quienEsElEcnargado () { return ventanilla.getCodigoCajero();}
}
