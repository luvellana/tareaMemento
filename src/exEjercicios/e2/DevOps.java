package exEjercicios.e2;

public class DevOps implements IHandler {

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
        if (sol.equals(Solicitudes.relacionadaAInfraestructura)){
            System.out.println("Atendido por DevOps ----> necesito la informacion del error, porfavor");
        } else {
            this.next.criteriaHandler(sol);
        }
    }
}
