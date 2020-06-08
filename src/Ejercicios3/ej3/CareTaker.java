package Ejercicios3.ej3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CareTaker {

    private ArrayList<Memento> savedStates= new ArrayList<>();

    public void addMemento(Memento memento){
        this.savedStates.add(memento);
    }

    public Memento getMemento(int i){
        return  this.savedStates.get(i-1);
    }

}
