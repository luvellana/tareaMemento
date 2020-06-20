package practica5.bridge;

public class PlazoFijo implements Cuenta {

    TipoMoneda tipo;

    private int montoActual;

    public PlazoFijo(TipoMoneda tipo) {
        this.tipo = tipo;
    }

    @Override
    public void depositar(int monto) {
        int interes = (monto * (2/100));
        int ingreso = ((monto+interes)/tipo.cambio());
        montoActual =  montoActual + interes;
        System.out.println("Se realizo un deposito de " + monto + " bolivianos al ser la cuenta en " + tipo.getNombre() + " el ingreso con el " +
                " tipo de cambio e interes es de " + ingreso +" el monto actual en la cuenta es de " + montoActual + tipo.getNombre() );
    }
}
