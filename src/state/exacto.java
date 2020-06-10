package state;

public class exacto implements  IState {
    @Override
    public void handle(int m, int p) {
        System.out.println("Monto exacto > Disfrutalo!");
    }
}
