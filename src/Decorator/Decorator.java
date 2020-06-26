package Decorator;


public class Decorator implements ICuenta {

    private ICuenta cuenta;
    private final ICuenta original;

    public Decorator (ICuenta cuenta){
        this.cuenta=cuenta;
        this.original = cuenta;
    }

    public ICuenta getCuenta() {
        return original;
    }

    @Override
    public void showData() {
        this.cuenta.showData();
    }
}
