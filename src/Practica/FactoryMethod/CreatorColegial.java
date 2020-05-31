package Practica.FactoryMethod;

public class CreatorColegial extends Creator{
    @Override
    public KitColegial crearProduct() {
        KitColegial kit = new KitColegial();
        kit.setMochila(new Mochila(2,"Carta"));
        kit.setCompu(new Computadora("Hp", "Windows"));
        kit.setLibro(new Libro("Novela", "J.K Rowling"));
        return kit;
    }
}
