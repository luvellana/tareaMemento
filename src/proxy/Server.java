package proxy;

/**
 * @autor : eynar.pari
 * @date : 23/06/2020.
 **/
public class Server implements IServidor {

   private Request request;

    public Server(){
    }

    @Override
    public void request() {
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
