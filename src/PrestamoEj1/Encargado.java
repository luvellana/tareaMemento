package PrestamoEj1;

public class Encargado implements IHandler {

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

        if (o == 100 ){
            System.out.println("Atendido por el encargado de prestamos > Se le devuelven todos los documentos");
        } else {
            System.out.println("Esta pagando mas de lo que debe");
        }

    }
}
