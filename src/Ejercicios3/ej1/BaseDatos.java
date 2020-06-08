package Ejercicios3.ej1;

import java.util.LinkedList;
import java.util.List;

public class BaseDatos {

    private List<Persona> personas = new LinkedList<Persona>();

    public BaseDatos(){

    }

    public void showData(){
        int i = 1;
        for(Persona p : personas){
            System.out.println("Persona " + i +": ");
            System.out.println("Nombre : "+p.getNombre());
            System.out.println("CI : "+p.getCi());
            System.out.println("Edad : "+p.getEdad());
            i++;
        }
    }

    public void addPersona (Persona p){
        personas.add(p);
    }



    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
}
//