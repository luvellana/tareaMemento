package proxy;

/**
 * @autor : eynar.pari
 * @date : 23/06/2020.
 **/
public class Client {

    public static void main (String []args){
       Proxy proxy = new Proxy();
       proxy.setRequest(new Request("descarga",".zip","imagenes"));
       proxy.request();
    }


}
