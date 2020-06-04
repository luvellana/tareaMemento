package command.ejercicio;

public class Usuario {
    private String name;

    public Usuario(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Usuario usuario1 = new Usuario("Pepe");
        Computadora computadora = new Computadora();

        Reiniciar reiniciar = new Reiniciar(receiver);
        Suspender suspender = new Suspender(receiver);
        Apagar apagar = new Apagar(receiver);
        CerrarSesion cerrarSesion = new CerrarSesion(receiver);

        computadora.setCommand(reiniciar);
        computadora.setCommand(cerrarSesion);
        computadora.setCommand(apagar);
        computadora.setCommand(suspender);

        computadora.executeCommands(usuario1);
    }
}
