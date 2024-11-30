
package ejercicio2;

public class GestorArchivos {
    private Almacenamiento almacenamiento;
    
    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    
    public void guardarArchivo() {
        almacenamiento.guardarArchivo();
    }
    
    public void recuperarArchivo() {
        almacenamiento.recuperarArchivo();
    }
}
