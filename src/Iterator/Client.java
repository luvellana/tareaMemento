package Iterator;

public class Client {
    public static void main (String [] args){

        Persona p1 = new Persona("Pepe",1);
        Persona p2 = new Persona("Juan",2);
        Persona p3 = new Persona("Coco",3);
        Persona p4 = new Persona("Lisa",4);
        Persona p5 = new Persona("Vivi",5);

        ListS1 S1= new ListS1();

        S1.add(p1);
        S1.add(p2);
        S1.add(p3);
        S1.add(p4);
        S1.add(p5);

        ListS2 S2= new ListS2();
        S2.add(p1);
        S2.add(p2);
        S2.add(p3);
        S2.add(p4);
        S2.add(p5);

        ListS2 S3= new ListS2();
        S3.add(p1);
        S3.add(p2);
        S3.add(p3);
        S3.add(p4);
        S3.add(p5);


        Iterator iterator;
        iterator = S1.iterator();
        while (iterator.hasNext()){
            System.out.println("Sistema1 > nombre : "+ ((Persona)iterator.next()).getNombre() );
        }

        System.out.println();

        iterator = S2.iterator();
        while (iterator.hasNext()){
            System.out.println("Sistema2 > nombre : "+ ((Persona)iterator.next()).getNombre());
        }

        System.out.println();

        iterator = S3.iterator();
        while (iterator.hasNext()){
            System.out.println("Sistema3 > nombre : "+ ((Persona)iterator.next()).getNombre());
        }

    }
}
