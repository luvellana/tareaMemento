package Ejercicios3.ej4;

public class Coronel implements  IHandler {

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

        if (o == Ordenes.Desbloqueo){
            System.out.println("Orden realizada por : Coronel");
        } else {
            this.next.criteriaHandler(o);
        }

    }
}
