package practica5.bridge;

public class Dolar implements TipoMoneda {
    private int MontoBoliviano = 7;
    private String nombre = "dolares";
    @Override
    public int cambio() {
        return MontoBoliviano;
    }
    @Override
    public String getNombre() {
        return nombre;
    }
}
