package Practica.AbstractFactory;

public class Ingles implements IMateria {

    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void action() {
        System.out.println("Te inscribiste a " + nombre);
    }
}
