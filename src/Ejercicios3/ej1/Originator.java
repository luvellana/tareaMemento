package Ejercicios3.ej1;

public class Originator {
    private Backup state;


    public Backup getState() {
        return state;
    }

    public void setState(Backup state) {
        System.out.println("new ----> Backup ----->"+ state.getAlias());
        this.state = state;
    }

    public Memento createMemento(){
        System.out.println("Save ---->  Backup  ----->" + state.getAlias());
        return new Memento(this.state);
    }

    public void restoreFromMemento(Memento n){
        this.state= n.getState();
        System.out.println("Restore --- > Backup  ----->" + this.state.getAlias());


    }

}
