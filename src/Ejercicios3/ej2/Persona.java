package Ejercicios3.ej2;

public class Persona {
    private boolean certificadoNacimiento;
    private boolean pagoBanco;
    private boolean ficha;

    public Persona(boolean certificadoNacimiento, boolean pagoBanco, boolean ficha) {
        this.certificadoNacimiento = certificadoNacimiento;
        this.pagoBanco = pagoBanco;
        this.ficha = ficha;
    }

    public boolean isCertificadoNacimiento() {
        return certificadoNacimiento;
    }

    public void setCertificadoNacimiento(boolean certificadoNacimiento) {
        this.certificadoNacimiento = certificadoNacimiento;
    }

    public boolean isPagoBanco() {
        return pagoBanco;
    }

    public void setPagoBanco(boolean pagoBanco) {
        this.pagoBanco = pagoBanco;
    }

    public boolean isFicha() {
        return ficha;
    }

    public void setFicha(boolean ficha) {
        this.ficha = ficha;
    }
}
