package state;

public class insuficiente implements  IState {
    @Override
    public void handle(int m, int p) {
        System.out.println("Monto insuficiente > "+ m + "$ necesitas " + (p-m) + "$ para el producto");
    }
}
