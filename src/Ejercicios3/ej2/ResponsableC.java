package Ejercicios3.ej2;

public class ResponsableC implements  IHandler {

    private IHandler next;

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

        if ( p.isCertificadoNacimiento() && p.isFicha() && p.isPagoBanco() ){
            System.out.println("Persona Atendida por : Responsable de carnetizacion ------> Su carnet esta listo");

        } else {
            this.next.criteriaHandler(p);
        }

    }
}
