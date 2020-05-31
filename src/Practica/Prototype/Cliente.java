package Practica.Prototype;

public class Cliente {
    public static void main(String[] args) {
        Docente d1 = new Docente("Juan", "pepe");
        Docente d2 = new Docente("maria", "arce");
        Docente d3 = new Docente("coco", "dece");
        Docente d4 = new Docente("luis", "serse");
        Docente d5 = new Docente("amanda", "buda");

        Contrato contrato = new Contrato();
        contrato.setSueldo(5000);
        contrato.setCarga_Horaria(80);
        contrato.setCurso_Educacion_Superior(true);
        contrato.setAccesoPlataforma(true);
        contrato.setMarcado_Biometrico(false);
        contrato.setMarcado_Entrada("8:00");
        contrato.setMarcado_Salida("18:00");

        contrato.setDocente(d1);

        Contrato c2 = contrato.clone();
        Contrato c3 = contrato.clone();
        Contrato c4 = contrato.clone();
        Contrato c5 = contrato.clone();
        c2.setDocente(d2);
        c3.setDocente(d3);
        c4.setDocente(d4);
        c5.setDocente(d5);

        System.out.println("se crearon los contratos de " + contrato.getDocente().getNombre() + ", "+ c2.getDocente().getNombre() + ", "+ c3.getDocente().getNombre() + ", "+ c4.getDocente().getNombre() + " y "+ c5.getDocente().getNombre());
    }
}
