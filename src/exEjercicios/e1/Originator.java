package exEjercicios.e1;

import java.util.List;

public class Originator {
    private Documento state;
    private int versionNow = -1;

    CareTaker careTaker = new CareTaker();

    public Documento getState() {
        return state;
    }

    public void newDoc(Documento state) {
        System.out.println("new ----> doc -----");
        state.showData();
        this.state = state;
    }

    public void guardarDocumento(){
        System.out.println("guardado ---->  ");
        state.showData();
        versionNow++;
        careTaker.addMemento(new Memento(this.state));
    }

    public void revertir(){
        versionNow = versionNow-1;
        this.state= careTaker.getMemento(versionNow).getState();
        System.out.println("crtl+z --- > doc  ");
        this.state.showData();
    }

    public void deshacerAdelante(){

        versionNow = versionNow+1;
        this.state= careTaker.getMemento(versionNow).getState();
        System.out.println("crtl+y --- > doc  ");
        this.state.showData();
    }

}
