package state;

public class superior implements IState {
    @Override
    public void handle(int m, int p) {
        System.out.println("Monto superior > Disfrutalo!, tu cambio: " + (m - p) + "$");
    }
}
