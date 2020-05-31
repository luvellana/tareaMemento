package Practica.Prototype;

public class Contrato implements IContrtato {
    private int Sueldo;
    private int Carga_Horaria;
    private boolean Curso_Educacion_Superior;
    private boolean AccesoPlataforma;
    private boolean Marcado_Biometrico;
    private String Marcado_Entrada;
    private String Marcado_Salida;
    private Docente docente;

    public Contrato() {
    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int sueldo) {
        Sueldo = sueldo;
    }

    public int getCarga_Horaria() {
        return Carga_Horaria;
    }

    public void setCarga_Horaria(int carga_Horaria) {
        Carga_Horaria = carga_Horaria;
    }

    public boolean isCurso_Educacion_Superior() {
        return Curso_Educacion_Superior;
    }

    public void setCurso_Educacion_Superior(boolean curso_Educacion_Superior) {
        Curso_Educacion_Superior = curso_Educacion_Superior;
    }

    public boolean isAccesoPlataforma() {
        return AccesoPlataforma;
    }

    public void setAccesoPlataforma(boolean accesoPlataforma) {
        AccesoPlataforma = accesoPlataforma;
    }

    public boolean isMarcado_Biometrico() {
        return Marcado_Biometrico;
    }

    public void setMarcado_Biometrico(boolean marcado_Biometrico) {
        Marcado_Biometrico = marcado_Biometrico;
    }

    public String getMarcado_Entrada() {
        return Marcado_Entrada;
    }

    public void setMarcado_Entrada(String marcado_Entrada) {
        Marcado_Entrada = marcado_Entrada;
    }

    public String getMarcado_Salida() {
        return Marcado_Salida;
    }

    public void setMarcado_Salida(String marcado_Salida) {
        Marcado_Salida = marcado_Salida;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    @Override
    public Contrato clone() {
        Contrato contrato = new Contrato();
        contrato.setAccesoPlataforma(this.AccesoPlataforma);
        contrato.setCarga_Horaria(this.Carga_Horaria);
        contrato.setCurso_Educacion_Superior(this.Curso_Educacion_Superior);
        contrato.setMarcado_Biometrico(this.Marcado_Biometrico);
        contrato.setMarcado_Entrada(this.Marcado_Entrada);
        contrato.setMarcado_Salida(this.Marcado_Salida);
        contrato.setSueldo(this.Sueldo);
        contrato.setDocente(this.docente);

        return contrato;
    }
}
