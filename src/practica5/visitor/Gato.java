package practica5.visitor;

public class Gato implements Animales {

    private int Enfermedad;
    private String nombre;

    public Gato(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEnfermedad() {
        return Enfermedad;
    }

    @Override
    public void Enfermedad(String enfermedad) {
        if(enfermedad.equals("enfermedad1")){
            Enfermedad=1;
        } else if(enfermedad.equals("enfermedad2")){
            Enfermedad=2;
        }
    }

    @Override
    public void accept(IVisitor visitor) {
       visitor.recetar(this);
    }
}
