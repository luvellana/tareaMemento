package exEjercicios.e1;


public class Client {

    public  static  void main (String[]args){

        Originator originator= new Originator();

        Documento doc = new Documento("Hola");
        originator.newDoc(doc);
        originator.guardarDocumento();

        doc = new Documento("Hola, como");
        originator.newDoc(doc);
        originator.guardarDocumento();

        doc = new Documento("Hola, como estas");
        originator.newDoc(doc);
        originator.guardarDocumento();

        doc = new Documento("Hola, como estas?");
        originator.newDoc(doc);
        originator.guardarDocumento();

        originator.revertir();
        originator.revertir();
        originator.revertir();

        originator.deshacerAdelante();
        originator.deshacerAdelante();
        originator.deshacerAdelante();



    }
}
