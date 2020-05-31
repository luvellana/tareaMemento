package Iterator;

import java.util.Vector;

public class IteratorS3 implements Iterator {
    private int position;
    private Vector<Persona> persona;

    public IteratorS3(Vector<Persona> persona){
        this.persona=persona;
        this.position=0;
    }

    @Override
    public Persona next() {
            return this.persona.get(position++);
    }

    @Override
    public boolean hasNext() {
        return this.persona.size() != 0 && position < this.persona.size();
    }
}
