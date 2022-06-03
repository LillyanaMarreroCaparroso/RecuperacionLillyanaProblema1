
public class Documento {

    public String nombreArchivo;
    public String tamanioArchivo;

    public Documento(String nombreArchivo, String tamanioArchivo) {
        this.nombreArchivo = nombreArchivo;
        this.tamanioArchivo = tamanioArchivo;
    }

    String getName(){
        return nombreArchivo;
    }

    String getTamanio() {
        return tamanioArchivo;
    }
}
