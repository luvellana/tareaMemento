package Decorator;

public class Cuenta implements ICuenta {
    private int monto;
    private String propietario;

    public Cuenta(int monto, String propietario) {
        this.monto = monto;
        this.propietario = propietario;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    @Override
    public void showData() {
        System.out.println("Monto: " + monto);
        System.out.println("Nombre Propietario: " + propietario);
    }
}
