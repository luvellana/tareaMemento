package exEjercicios.e2;

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
    public void criteriaHandler(Solicitudes sol) {
        Developer dev = new Developer();
        Finanzas f = new Finanzas();
        QA q = new QA();
        DevOps dO = new DevOps();
        Support s = new Support();

        this.setNext(dO);
        dO.setNext(q);
        q.setNext(dev);
        dev.setNext(f);
        f.setNext(s);

        this.next.criteriaHandler(sol);
    }
}
