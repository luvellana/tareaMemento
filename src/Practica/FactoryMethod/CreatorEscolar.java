package Practica.FactoryMethod;

public class CreatorEscolar extends Creator {
    @Override
    public IKit crearProduct() {
        KitEscolar kit = new KitEscolar();
        kit.setCuaderno(new Cuadernos("carta", 100));
        kit.setDeportivo(new Deportivo("M","verde" , 9));
        kit.setMochila(new Mochila(5,"Oficio"));
        return kit;
    }
}
