package exEjercicios.e5;

import java.util.LinkedList;
import java.util.List;

public class Computadora {
    private IState state;
    private List<String> programasAbiertos = new LinkedList<String>();
    private int consumoRam;
    private int consumoCPU;

    public Computadora(){
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }


    public void request(){
        state.handle(this);
    }

    public List<String> getProgramasAbiertos() {
        return programasAbiertos;
    }

    public void setProgramasAbiertos(List<String> programasAbiertos) {
        this.programasAbiertos = programasAbiertos;
    }

    public int getConsumoRam() {
        return consumoRam;
    }

    public void setConsumoRam(int consumoRam) {
        this.consumoRam = consumoRam;
    }

    public int getConsumoCPU() {
        return consumoCPU;
    }

    public void setConsumoCPU(int consumoCPU) {
        this.consumoCPU = consumoCPU;
    }
}
