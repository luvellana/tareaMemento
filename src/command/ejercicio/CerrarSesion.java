package command.ejercicio;

public class CerrarSesion implements ICommand {
    private Receiver receiver;

    public CerrarSesion(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.cerrarSesion();
    }
}
