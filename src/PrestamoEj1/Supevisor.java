package PrestamoEj1;

public class Supevisor implements IHandler {

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
        //  condicion para poder hacerme responsable de esa informacion

        if (o > 50 && o < 100){
            System.out.println("Atendido por el supervisor > desea un nuevo prestamo?");
        } else {
            this.next.criteriaHandler(o);
        }

    }
}
