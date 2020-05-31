package Practica.Builder;

public class Cliente {
    public static void main(String[] args) {
        Pizzero pizzero = new Pizzero();

        PizzaBuilder concreteProduct1= new Hawaiana();
        PizzaBuilder concreteProduct2= new Carnivora();


        pizzero.setBuilder(concreteProduct1);
        pizzero.buildProduct();
        Pizza pizza1 = pizzero.getBuilder();

        pizzero.setBuilder(concreteProduct2);
        pizzero.buildProduct();
        Pizza pizza2 = pizzero.getBuilder();

        pizza1.showData();
        pizza2.showData();
    }
}
