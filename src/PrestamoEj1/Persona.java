package PrestamoEj1;

public class Persona {
    private String nombre;
    private int prestamo;
    private int pago;

    public Persona(String nombre, int prestamo) {
        this.nombre = nombre;
        this.prestamo = prestamo;
        this.pago = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(int prestamo) {
        this.prestamo = prestamo;
    }

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }

    public void realizarPago(int monto, Banco o){
        if (monto > 0 ){
            System.out.println(nombre + ": ");
            pago = pago + monto;
        int porcentaje = (pago * 100)/prestamo;

        o.criteriaHandler(porcentaje);
        }else{
            System.out.println("debe ingresar un monto de pago valido");
        }


    }
}
