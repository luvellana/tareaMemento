package Ejercicios3.ej4;

public class General implements  IHandler {

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
    public void criteriaHandler(Ordenes o) {
        //  condicion para poder hacerme responsable de esa informacion

        if (o == Ordenes.Entrevista ){
            System.out.println("Orden realizada por : General");
        } else {
            this.next.criteriaHandler(o);
        }

    }
}
