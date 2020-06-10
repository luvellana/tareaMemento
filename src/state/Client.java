package state;

public class Client {
    public static void main(String [] abc){

        Maquina m = new Maquina();

        m.pedido(20, Maquina.producto.chocolate);
        m.pedido(5, Maquina.producto.jugo);
        m.pedido(3, Maquina.producto.galletas);

    }

}
