package Ejercicios3.ej1;

import java.util.HashMap;
import java.util.Map;

public class CareTaker {

    private Map<String, Memento> savedStates= new HashMap<>();

    public void addMemento(String alias, Memento memento){
        this.savedStates.put(alias, memento);
    }

    public Memento getMemento(String alias){
        return  this.savedStates.get(alias);
    }

}
