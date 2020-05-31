package Practica.Builder;

public class Pizzero {

    private PizzaBuilder builder;

    public Pizza getBuilder() {
        return builder.getProduct();
    }

    public void setBuilder(PizzaBuilder builder) {
        this.builder = builder;
    }

    public  void buildProduct(){
        builder.createProduct();
        builder.buildmasa();
        builder.buildqueso();
        builder.buildsalsa();
        builder.buildtipo();
    }
}
