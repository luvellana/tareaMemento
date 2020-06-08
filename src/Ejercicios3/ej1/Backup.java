package Ejercicios3.ej1;

import java.util.LinkedList;
import java.util.List;

public class Backup {

    private String Alias;
    private List<Persona> personas = new LinkedList<Persona>();

    public Backup(BaseDatos b, String A) {
        ListarPersonas(b.getPersonas());
        Alias=A;
    }

    public void ListarPersonas(List<Persona> l){
        for(Persona p : l){
            this.personas.add(p);
        }
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public String getAlias() {
        return Alias;
    }

    public void showData() {

        System.out.println("Backup : "+ this.Alias);
        int i = 1;
        for(Persona p : personas){
            System.out.println("Persona " + i +": ");
            System.out.println("Nombre : "+p.getNombre());
            System.out.println("CI : "+p.getCi());
            System.out.println("Edad : "+p.getEdad());
            i++;
        }

    }
}
