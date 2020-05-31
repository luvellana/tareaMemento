package Practica.FactoryMethod;

public class Cliente {
    public static void main(String[] args) {
        Creator k1 = new CreatorEscolar();
        Creator k2 = new CreatorColegial();

        k1.crearProduct().action();
        k2.crearProduct().action();
    }
}
