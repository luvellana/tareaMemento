package Memento;


public class Client {

    public  static  void main (String[]args){

        CareTaker careTaker = new CareTaker();
        Originator originator= new Originator();

        Versionador v;


        v= new Versionador("X","1");
        originator.setState(v);
        careTaker.addMemento("primer estado", originator.createMemento());

        v= new Versionador("Y","2");
        originator.setState(v);

        v= new Versionador("Z","3");
        originator.setState(v);
        careTaker.addMemento("segundo estado", originator.createMemento());

        originator.restoreFromMemento(careTaker.getMemento("primer estado"));

    }
}
