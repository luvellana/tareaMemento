package abstractFactory;

public class Fruta {
     private String tipoFruta;
     private String nombre;
     private int costo;

    public Fruta(String tipoFruta, String nombre, int costo) {
        this.tipoFruta = tipoFruta;
        this.nombre = nombre;
        this.costo = costo;
    }

    public String getTipoFruta() {
        return tipoFruta;
    }

    public void setTipoFruta(String tipoFruta) {
        this.tipoFruta = tipoFruta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }


}
