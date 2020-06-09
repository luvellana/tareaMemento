package state;

public class exacto implements  IState {
    @Override
    public void handle() {
        System.out.println("State > ConcreteStateB");
    }
}
