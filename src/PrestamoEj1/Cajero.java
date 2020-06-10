package PrestamoEj1;

public class Cajero implements IHandler {

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
    public void criteriaHandler(int o) {
        if (o < 25){
            System.out.println("Atendido por cajero");
        } else {
            this.next.criteriaHandler(o);
        }
    }
}
