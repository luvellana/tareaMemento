package practica5.bridge;

public class Euro implements TipoMoneda {
    private int MontoBoliviano = 8;
    private String nombre = "euros";

    @Override
    public int cambio() {
        return MontoBoliviano;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
