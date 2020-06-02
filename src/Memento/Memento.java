package Memento;

public class Memento {

    private Versionador state;

    public Memento(Versionador stateSaved){
        this.state=stateSaved;
    }

    public Versionador getState() {
        return state;
    }

    public void setState(Versionador state) {
        this.state = state;
    }
}
