package exEjercicios.e2;

public class Client {

    public static void main (String [] args){

        Organizador o = new Organizador();

        o.criteriaHandler(IHandler.Solicitudes.Otros);

        o.criteriaHandler(IHandler.Solicitudes.relacionadaAInfraestructura);
        o.criteriaHandler(IHandler.Solicitudes.BugOMejora);
        o.criteriaHandler(IHandler.Solicitudes.Costos);
        o.criteriaHandler(IHandler.Solicitudes.nuevaFuncionalidad);


    }
}
