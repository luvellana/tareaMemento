package Ejercicios3.ej3;

public class Documento {

    private int version;
    private String documento;

    public Documento(int v, String state){
        this.version =v;
        this.documento=state;
    }

    public void showData(){
        System.out.println("version : "+this.version);
        System.out.println("documento : "+this.documento);
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getState() {
        return documento;
    }

    public void setState(String state) {
        this.documento = state;
    }
}
//