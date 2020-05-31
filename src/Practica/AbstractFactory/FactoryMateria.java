package Practica.AbstractFactory;

public class FactoryMateria {
    enum materia {
        Matematicas, Historia, Lenguaje, Ingles
    }

    public static IMateria make(materia type) {

        IMateria materia;

        switch (type) {
            case Matematicas:
                materia = new Matematica();
                ((Matematica) materia).setNombre("Matematicas");
                break;
            case Historia:
                materia = new Historia();
                ((Historia) materia).setNombre("Historia");
                break;
            case Lenguaje:
                materia = new Lenguaje();
                ((Lenguaje) materia).setNombre("Lenguaje");
                break;
            case Ingles:
                materia = new Ingles();
                ((Ingles) materia).setNombre("Ingles");
                break;

            default:
                materia = new Lenguaje();
                ((Lenguaje) materia).setNombre("Lenguaje");
                break;
        }
        return materia;
    }
}
