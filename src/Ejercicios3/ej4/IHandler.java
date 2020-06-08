package Ejercicios3.ej4;


public interface IHandler {

    public enum Ordenes{ Entrevista,  Disciplina, Desbloqueo, Limpieza}

    void setNext(IHandler handler);
    IHandler next();
    void criteriaHandler(Ordenes orden);

}
