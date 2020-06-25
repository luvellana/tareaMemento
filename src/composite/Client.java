package composite;

public class Client {
    public static void main (String [] args){
        computadora c1 = new computadora();
        computadora c2 = new computadora();
        computadora c3 = new computadora();

        laboratorio lab1 = new laboratorio();
        lab1.add(c1);
        lab1.add(c2);
        lab1.add(c3);

        laboratorio lab2 =new laboratorio();
        lab2.add(c1);

        laboratorio lab3 =new laboratorio();
        lab3.add(c1);
        lab3.add(c2);

        Composite cc1 = new Composite();
        cc1.add(lab1);
        cc1.add(lab2);
        cc1.add(lab3);

        cc1.precioTotal();
    }
}
