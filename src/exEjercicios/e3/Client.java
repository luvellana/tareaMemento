package command_3;

public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Atacar atacar = new Atacar(receiver);
        ModoDefensa modoDefensa = new ModoDefensa(receiver);
        Disparar disparar = new Disparar(receiver);

        Juego juego = new Juego();

        juego.setCommand(atacar);
        juego.setCommand(disparar);
        juego.setCommand(modoDefensa);
        juego.setCommand(disparar);
        juego.setCommand(atacar);
        juego.setCommand(modoDefensa);
        juego.setCommand(atacar);

        juego.executeCommands();
    }
}
