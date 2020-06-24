package proxy;

/**
 * @autor : eynar.pari
 * @date : 23/06/2020.
 **/
public class Proxy implements IServidor {

    private Server server;
    private Request request;
    private server2 server2;

    public Proxy(){
        server = new Server();
        server2 = new server2();
    }

    @Override
        public void request() {
        if (request.getFormatoArchivo().equals(".zip")||request.getFormatoArchivo().equals(".rar")){
            this.server.setRequest(this.request);
            this.server.request();
            this.server2.setRequest(this.request);
            this.server2.request();
        }else{
            System.out.println("no se puede realizar la " + request.getTipoRequest() + " porque el formato del archivo debe ser '.rar' o '.zip'");

        }

    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }
}
