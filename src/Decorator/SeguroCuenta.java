package Decorator;


public class SeguroCuenta extends Decorator {
    public SeguroCuenta(ICuenta cuenta) {
        super(cuenta);
    }

    public void showData() {
        int monto = ((Cuenta)super.getCuenta()).getMonto();
        int newMonto = monto - (monto*(2/100));
        ((Cuenta)super.getCuenta()).setMonto(newMonto);
        super.showData();
        System.out.println("Se cobro el 2% para el seguro de la cuenta");

    }

}
