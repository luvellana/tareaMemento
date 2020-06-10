package PrestamoEj1;

public class Banco implements IHandler {
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
    public void criteriaHandler(int p) {
        Encargado e = new Encargado();
        Supevisor s = new Supevisor();
        AgenteCredito a = new AgenteCredito();
        Cajero c = new Cajero();

        this.setNext(c);
        c.setNext(a);
        a.setNext(s);
        s.setNext(e);

        this.next.criteriaHandler(p);
    }
}
