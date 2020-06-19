package exEjercicios.e2;

public class QA implements IHandler {

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

        if (sol.equals(Solicitudes.BugOMejora)){
            System.out.println("Atendido por QA > se Aislara el error");
        } else {
            this.next.criteriaHandler(sol);
        }

    }
}
