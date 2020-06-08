package Ejercicios3.ej4;

public class Client {

    public static void main (String [] args){

        Organizador organizador = new Organizador();

        organizador.criteriaHandler(IHandler.Ordenes.Entrevista);
        organizador.criteriaHandler(IHandler.Ordenes.Limpieza);
        organizador.criteriaHandler(IHandler.Ordenes.Disciplina);
        organizador.criteriaHandler(IHandler.Ordenes.Desbloqueo);

    }
}
