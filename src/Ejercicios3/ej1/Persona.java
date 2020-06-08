package Ejercicios3.ej1;

public class Persona {
    private String nombre;
    private int ci;
    private int edad;

    public Persona(String nombre, int ci, int edad) {
        this.nombre = nombre;
        this.ci = ci;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCi() {
        return ci;
    }

    public int getEdad() {
        return edad;
    }
}
