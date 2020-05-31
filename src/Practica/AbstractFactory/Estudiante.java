package Practica.AbstractFactory;

public class Estudiante {
    private String nombre;
    private IMateria materia;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public void Inscribirse(IMateria materia){
        this.materia = materia;
        materia.action();
    }
}
