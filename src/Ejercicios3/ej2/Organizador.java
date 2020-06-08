package Ejercicios3.ej2;

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
    public void criteriaHandler(Persona p) {


        ResponsableC r = new ResponsableC();
        notario n = new notario();
        Cajero c = new Cajero();
        ServicioCliente s = new ServicioCliente();

        this.setNext(r);
        r.setNext(n);
        n.setNext(c);
        c.setNext(s);
        n.setAnterior(r);
        c.setAnterior(r);

        this.next.criteriaHandler(p);
    }
}
