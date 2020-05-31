package Practica.Builder;

public abstract class PizzaBuilder {
    protected  Pizza pizzas;

    public Pizza getProduct(){
        return this.pizzas;
    }

    public void createProduct(){
        pizzas=new Pizza();
    }

    public abstract void buildqueso();
    public abstract void buildmasa();
    public abstract void buildsalsa();
    public abstract void buildtipo();
}
