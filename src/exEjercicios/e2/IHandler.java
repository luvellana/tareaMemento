package exEjercicios.e2;


public interface IHandler {

    enum Solicitudes {relacionadaAInfraestructura, BugOMejora, nuevaFuncionalidad, Costos, Otros}

    void setNext(IHandler handler);
    IHandler next();
    void criteriaHandler(Solicitudes sol);

}
