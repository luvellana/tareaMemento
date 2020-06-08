package Ejercicios3.ej2;

public class ServicioCliente implements  IHandler {

    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        this.next=handler;
    }

    @Override
    public IHandler next() {
        return this.next;
    }

    @Override
    public void criteriaHandler(Persona p) {

        System.out.println("Persona Atendida por : Servicio al cliente ------>  necesita una ficha, certificado de nacimiento y pago al banco ");
        System.out.println("A usted le falta: ");
        if(!p.isPagoBanco()){
            System.out.println("- Pago al banco ");
        }
        if(!p.isCertificadoNacimiento()){
            System.out.println("- Certificado de nacimiento ");
        }
        if(!p.isFicha()){
            System.out.println("- Ficha ");
        }
        System.out.println("Gracias, vuelva pronto ");

    }
}
