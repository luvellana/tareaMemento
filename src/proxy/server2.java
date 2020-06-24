package proxy;

public class server2 implements IServidor {

    private Request request;

    public server2(){
    }
    @Override
    public void request() {
        System.out.println("INFO> respaldo de seguridad");
        System.out.println("INFO> peticion recibida");
        System.out.println("INFO> RealSubject: request "+ this.request.getTipoRequest());
        System.out.println("INFO> RealSubject: " + this.request.getNombreArchivo() +" // fomato archivo "+ this.request.getFormatoArchivo());
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }
}
