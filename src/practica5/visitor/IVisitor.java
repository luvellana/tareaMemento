package practica5.visitor;

public interface IVisitor {

    void recetar(Gato gato);
    void recetar(Caballo caballo);
    void recetar(Perro perro);

}
