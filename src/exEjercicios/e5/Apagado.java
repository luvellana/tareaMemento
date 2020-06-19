package exEjercicios.e5;

import java.util.LinkedList;

public class Apagado implements  IState {

    @Override
    public void handle(Computadora c) {

        c.setProgramasAbiertos(new LinkedList<String>());
        c.setConsumoCPU(0);
        c.setConsumoRam(0);
        System.out.println("State > Apagado");
    }
}
