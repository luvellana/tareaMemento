package exEjercicios.e5;

import java.util.LinkedList;

public class Reiniciar implements  IState {


    @Override
    public void handle(Computadora c) {

        c.setProgramasAbiertos(new LinkedList<String>());
        c.setConsumoCPU(0);
        c.setConsumoRam(0);System.out.println("State > Reiniciando");

        System.out.println("No hay programas abiertos");
        System.out.println("Consumo de RAM: " + c.getConsumoRam() +"%");
        System.out.println("Consumo de CPU: " + c.getConsumoCPU() +"%");
    }
}
