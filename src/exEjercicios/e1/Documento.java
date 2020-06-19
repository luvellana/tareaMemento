package exEjercicios.e1;

public class Documento {

    private String doc;

    public Documento(String doc){
        this.doc=doc;
    }

    public void showData(){
        System.out.println("documento : "+this.doc);
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String name) {
        this.doc = name;
    }

}
//