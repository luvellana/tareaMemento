package exEjercicios.e5;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Prendido implements IState {

    Random r = new Random();
    private List<String> programasAbiertos = new LinkedList<String>();

    @Override
    public void handle(Computadora c) {
        int j = r.nextInt(10);
        for(int i = 0; i < j+1 ; i++){
            programasAbiertos.add("Programa"+(i+1));
        }
        c.setProgramasAbiertos(programasAbiertos);
        c.setConsumoCPU(5);
        c.setConsumoRam(5);

        System.out.println("State > Prendido");
        System.out.println("Programas Abieros:" + c.getProgramasAbiertos().toString());
        System.out.println("Consumo de RAM: " + c.getConsumoRam() +"%");
        System.out.println("Consumo de CPU: " + c.getConsumoCPU() +"%");
    }
}
