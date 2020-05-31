package abstractFactory;

public class Heladero {
    public static void main(String[] args) {
        FactoryHelado creator = new FactoryHelado();
        creator.make("Agua").action();

        // estatico
        FactoryH2.make("Mixto").action();

        FactoryHeladoconEnum.make(FactoryHeladoconEnum.helados.Crema).action();
    }
}
