package exEjercicios.e1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CareTaker {

    private List<Memento> m = new LinkedList<Memento>();

    public void addMemento(Memento memento){
        this.m.add(memento);
    }

    public Memento getMemento(int n){
        return  this.m.get(n);
    }

}
