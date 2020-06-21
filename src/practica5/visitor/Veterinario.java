package practica5.visitor;

import java.time.LocalDateTime;

public class Veterinario implements IVisitor {

    LocalDateTime localDateTime;

    @Override
    public void recetar(Gato gato) {
      if (gato.getEnfermedad() == 1){
          System.out.println(gato.getNombre() + " tiene la enfermedad1, asi que debe tomar la cura1, receta entregada :" + localDateTime.now());
      }else{

          System.out.println(gato.getNombre() + " tiene la enfermedad2, asi que debe tomar la cura2, receta entregada :" + localDateTime.now());
      }
    }

    @Override
    public void recetar(Caballo caballo) {
        if (caballo.getEnfermedad() ==1){
            System.out.println(caballo.getNombre() + " tiene la enfermedad1, asi que debe tomar la cura1, receta entregada :" + localDateTime.now());
        }else{
            System.out.println(caballo.getNombre() + " tiene la enfermedad2, asi que debe tomar la cura2, receta entregada :" + localDateTime.now());
        }
    }

    @Override
    public void recetar(Perro perro) {
        if (perro.getEnfermedad() == 1) {
            System.out.println(perro.getNombre() + "  tiene la enfermedad1, asi que debe tomar la cura1, receta entregada :" + localDateTime.now());
        } else {
            System.out.println(perro.getNombre() + " tiene la enfermedad2, asi que debe tomar la cura2, receta entregada :" + localDateTime.now());
        }
    }
}
