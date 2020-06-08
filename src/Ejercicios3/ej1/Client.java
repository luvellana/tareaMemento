package Ejercicios3.ej1;


public class Client {

    public  static  void main (String[]args){

        CareTaker careTaker = new CareTaker();
        Originator originator= new Originator();

        BaseDatos b=new BaseDatos();



        b.addPersona(new Persona("pepe", 265985, 19));
        b.addPersona(new Persona("mari", 586857, 20));
        b.addPersona(new Persona("jose", 87157, 21));
        b.addPersona(new Persona("juan", 2655675, 19));
        originator.setState(new Backup(b, "BackupEnero"));
        careTaker.addMemento("BackupEnero", originator.createMemento());


        b.addPersona(new Persona("mili", 5277, 21));
        b.addPersona(new Persona("kiki", 2785372, 18));
        originator.setState(new Backup(b, "BackupFeb"));
        careTaker.addMemento("BackupFeb", originator.createMemento());

        b.addPersona(new Persona("fulano", 175724, 40));
        b.addPersona(new Persona("gus", 57254, 30));
        b.addPersona(new Persona("ren", 26857, 25));
        originator.setState(new Backup(b, "BackupMar"));
        careTaker.addMemento("BackupMar", originator.createMemento());


        b.addPersona(new Persona("fulano", 175724, 40));
        b.addPersona(new Persona("gus", 57254, 30));
        originator.setState(new Backup(b, "BackupAbr"));
        careTaker.addMemento("BackupAbr", originator.createMemento());


        b.addPersona(new Persona("fulano", 175724, 40));
        originator.setState(new Backup(b, "BackupMay"));
        careTaker.addMemento("BackupMay", originator.createMemento());

        originator.restoreFromMemento(careTaker.getMemento("BackupFeb"));
        originator.getState().showData();

    }
}
