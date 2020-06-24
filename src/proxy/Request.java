package proxy;

/**
 * @autor : eynar.pari
 * @date : 23/06/2020.
 **/
public class Request {

    private String tipoRequest;
    private String formatoArchivo;
    private String nombreArchivo;

    public Request(String tipoRequest, String formatoArchivo, String nombreArchivo){
        this.tipoRequest =tipoRequest;
        this.formatoArchivo =formatoArchivo;
        this.nombreArchivo =nombreArchivo;
    }

    public String getTipoRequest() {
        return tipoRequest;
    }

    public void setTipoRequest(String tipoRequest) {
        this.tipoRequest = tipoRequest;
    }

    public String getFormatoArchivo() {
        return formatoArchivo;
    }

    public void setFormatoArchivo(String formatoArchivo) {
        this.formatoArchivo = formatoArchivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
}
