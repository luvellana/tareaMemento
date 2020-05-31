package Iterator;

import java.util.LinkedList;
import java.util.List;

public class ListS2 implements IAggregateList {

    List<Persona> persona;

    public ListS2(){
        persona = new LinkedList<Persona>();
    }

    public void add(Persona value){
        persona.add(value);
    }

    @Override
    public IteratorS2 iterator() {
        return new IteratorS2(this.persona);
    }
}
