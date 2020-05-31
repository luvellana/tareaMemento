package Practica.AbstractFactory;

import abstractFactory.FactoryHeladoconEnum;

public class Cliente {
    public static void main(String[] args) {
        IMateria matematicas = FactoryMateria.make(FactoryMateria.materia.Matematicas);
        IMateria historia = FactoryMateria.make(FactoryMateria.materia.Historia);
        IMateria lenguaje = FactoryMateria.make(FactoryMateria.materia.Lenguaje);
        IMateria ingles = FactoryMateria.make(FactoryMateria.materia.Ingles);

        Estudiante juan = new Estudiante("Juan");
        Estudiante pepe = new Estudiante("pepe");
        Estudiante maria = new Estudiante("maria");
        Estudiante gigi = new Estudiante("gg");
        Estudiante jojo = new Estudiante("jojo");

        juan.Inscribirse(matematicas);
        pepe.Inscribirse(historia);
        maria.Inscribirse(ingles);
        gigi.Inscribirse(lenguaje);
        jojo.Inscribirse(ingles);

    }
}
