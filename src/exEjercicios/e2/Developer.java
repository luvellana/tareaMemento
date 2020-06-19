package exEjercicios.e2;

public class Developer implements IHandler {

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

        if (sol.equals(Solicitudes.nuevaFuncionalidad) ){
            System.out.println("Atendido por el Developer > Se hara una estimacion de la solicitud");
        } else {
            this.next.criteriaHandler(sol);
        }

    }
}
