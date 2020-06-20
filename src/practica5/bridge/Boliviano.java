package practica5.bridge;

public class Boliviano implements TipoMoneda {
    private int MontoBoliviano = 1;
    private String nombre = "bolivianos";
    @Override
    public int cambio() {
        return MontoBoliviano;
    }
    @Override
    public String getNombre() {
        return nombre;
    }
}
