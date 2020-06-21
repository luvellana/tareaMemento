package practica5.adapter;

public class Electronico2Adapter implements AElectronicos {
    // caracteristica
    private AElectronicos2 adaptee;

    public Electronico2Adapter(AElectronicos2 adaptee){
        this.adaptee= adaptee;
    }


    @Override
    public void Precio() {
        this.adaptee.Costo();
    }

    @Override
    public void tiempoDeVida() {
        this.adaptee.tiempoDeGarantia();
    }

}
