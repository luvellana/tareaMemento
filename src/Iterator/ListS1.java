package Iterator;

public class ListS1 implements IAggregateList {

    private int position;
    private Persona[] persona;

    public ListS1(){
        this.position=0;
        persona= new Persona[5];
    }

    public void add(Persona value){
        persona[position]=value;
        position++;
    }

    @Override
    public IteratorS1 iterator() {
        return new IteratorS1(this.persona);
    }
}
