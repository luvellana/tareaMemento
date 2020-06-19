package exEjercicios.e5;

public class Client {
    public static void main(String [] abc){

        IState a = new Apagado();
        IState r = new Reiniciar();
        IState p = new Prendido();

        Computadora context = new Computadora();
        context.setState(a);
        context.request();

        context.setState(r);
        context.request();

        context.setState(p);
        context.request();

        System.out.println(context.getProgramasAbiertos().toString()+" --------------- "+context.getConsumoRam());

    }

}
