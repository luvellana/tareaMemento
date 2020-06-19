package adapter;

public class ElectricoAdapter implements IAuto {
    // caracteristica
    private Electrico adaptee;

    public ElectricoAdapter(Electrico adaptee){
        this.adaptee= adaptee;
    }


    @Override
    public void llenarGasolina(int x) {
        this.adaptee.Cargar();
    }

    @Override
    public int estadoCombustible() {
        //logica
        return this.adaptee.estadoDeElectricidad();
    }

}
