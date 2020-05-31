package Iterator;

public class IteratorS1 implements Iterator {

    private int position;
    private Persona[] persona;

    public IteratorS1(Persona [] persona){
        this.persona=persona;
    }

    @Override
    public Persona next() {
            return this.persona[position++];
    }


    @Override
    public boolean hasNext() {
        return this.persona.length != 0 && position < this.persona.length;
    }
}
