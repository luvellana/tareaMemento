package state;

public class superior implements IState {
    @Override
    public void handle() {
        System.out.println("State > ConcreteStateA");
    }
}
