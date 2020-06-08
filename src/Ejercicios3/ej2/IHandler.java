package Ejercicios3.ej2;


public interface IHandler {

    void setNext(IHandler handler);
    IHandler next();
    void criteriaHandler(Persona p);   // nuestra peticion

}
