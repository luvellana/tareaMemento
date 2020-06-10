package PrestamoEj1;

public class AgenteCredito implements IHandler {

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

        if (o >= 25 && o < 50){
            System.out.println("Atendido por Agente de credito > Quisiera refinanciar su prestamo?");
        } else {
            this.next.criteriaHandler(o);
        }

    }
}
