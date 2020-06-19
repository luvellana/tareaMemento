package exEjercicios.e2;

public class Finanzas implements IHandler {

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

        if (sol.equals(Solicitudes.Costos)){
            System.out.println("Atendido por Finanzas");
        } else {
            this.next.criteriaHandler(sol);
        }

    }
}
