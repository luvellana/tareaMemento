package Ejercicios3.ej4;

public class Organizador implements IHandler {
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
    public void criteriaHandler(Ordenes orden) {
        General g = new General(); //   500 -1000
        Teniente t = new Teniente(); // <100
        Coronel co = new Coronel(); //  100- 500
        Cabo ca = new Cabo();

        // orden de la cadena responsabilidad
        this.setNext(g);
        g.setNext(t);
        t.setNext(co);
        co.setNext(ca);

        this.next.criteriaHandler(orden);
    }
}
