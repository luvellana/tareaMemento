package abstractFactory;

public class Agua implements IHelado {
    private String tamano;
    private String forma;
    private Fruta fruta;
    private Base base;

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public Fruta getFruta() {
        return fruta;
    }

    public void setFruta(Fruta fruta) {
        this.fruta = fruta;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    @Override
    public void action() {
        System.out.println("Se creo helado de Agua de " + getFruta().getNombre());
    }
}
