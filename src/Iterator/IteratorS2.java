package Iterator;

import java.util.List;

public class IteratorS2 implements Iterator {

    private int position;
    private List<Persona> persona;

    public IteratorS2(List<Persona> persona){
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
