package Ejercicios3.ej4;

public class Cabo implements  IHandler {

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
        System.out.println("Orden realizada por : Cabo");
    }
}
