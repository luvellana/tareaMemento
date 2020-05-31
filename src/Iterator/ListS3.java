package Iterator;

import java.util.Vector;

public class ListS3 implements IAggregateList {
    Vector<Persona> persona;

    public ListS3(){
        persona = new Vector<>();
    }

    public void add(Persona value){
        persona.add(value);
    }

    @Override
    public IteratorS3 iterator() {
        return new IteratorS3(this.persona);
    }
}
