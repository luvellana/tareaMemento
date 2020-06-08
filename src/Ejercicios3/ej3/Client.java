package Ejercicios3.ej3;


public class Client {

    public  static  void main (String[]args){

        CareTaker careTaker = new CareTaker();
        Originator originator= new Originator();

        Documento v;


        v= new Documento(1,"Tesis");
        originator.setState(v);
        careTaker.addMemento( originator.createMemento());

        v= new Documento(2,"Tesis, ");
        originator.setState(v);
        careTaker.addMemento(originator.createMemento());


        v= new Documento(3,"Tesis, Hola ");
        originator.setState(v);
        careTaker.addMemento(originator.createMemento());

        v= new Documento(4,"Tesis, Hola esta es ");
        originator.setState(v);
        careTaker.addMemento(originator.createMemento());

        v= new Documento(5,"Tesis, Hola esta es mi tesis ");
        originator.setState(v);
        careTaker.addMemento( originator.createMemento());

        originator.restoreFromMemento(careTaker.getMemento(3));

    }
}
