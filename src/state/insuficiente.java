package state;

public class insuficiente implements  IState {
    @Override
    public void handle() {
        System.out.println("State > ConcreteStateA");
    }
}
