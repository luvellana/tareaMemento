package practica5.visitor;

public interface Animales {

    void Enfermedad(String x);

    void accept(IVisitor visitor);
}
