package state;

public class Context {
    // agregar- cumpla patron state
    private IState state;

    public Context(){
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    public void request(int m, int p){
        state.handle(m, p);
    }

}