package Practica.Builder;

public class Pizza {

    private String TipoQueso;
    private String salsa;
    private String masa;
    private String tipoPizza;

    public String getTipoPizza() {
        return tipoPizza;
    }

    public void setTipoPizza(String tipoPizza) {
        this.tipoPizza = tipoPizza;
    }

    public String getTipoQueso() {
        return TipoQueso;
    }

    public void setTipoQueso(String tipoQueso) {
        TipoQueso = tipoQueso;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }
    public void showData(){
        System.out.println("Se creo pizza " + tipoPizza);

    }
}
