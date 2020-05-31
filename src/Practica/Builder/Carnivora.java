package Practica.Builder;

public class Carnivora extends PizzaBuilder {

    @Override
    public void buildqueso() {
        pizzas.setTipoQueso("motzzarella");
    }

    @Override
    public void buildmasa() {
        pizzas.setMasa("masa");
    }

    @Override
    public void buildsalsa() {
        pizzas.setMasa("salsa de tomate");
    }

    @Override
    public void buildtipo() {
        pizzas.setTipoPizza("Carnivora");
    }

}
