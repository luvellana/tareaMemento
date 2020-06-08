package Ejercicios3.ej2;

public class Cajero implements  IHandler {

    private IHandler next;
    private IHandler anterior;
    public void setAnterior(IHandler handler) {
        this.anterior=handler;
    }

    @Override
    public void setNext(IHandler handler) {
        this.next=handler;
    }

    @Override
    public IHandler next() {
        return this.next;
    }

    @Override
    public void criteriaHandler(Persona p) {
        //  condicion para poder hacerme responsable de esa informacion

        if (p.isFicha() && !p.isPagoBanco() && p.isCertificadoNacimiento()){
            System.out.println("Persona Atendida por : cajero ------> Pago realizado, pase al encargado de carnetizacion");
            p.setPagoBanco(true);
            anterior.criteriaHandler(p);
        } else {
            this.next.criteriaHandler(p);
        }

    }
}
