
package ejercicio2;

public class AlmacenamientoLocal implements Almacenamiento {
    @Override
    public void guardarArchivo() {
        System.out.println("Guardando archivo localmente... ");
    }
    
    @Override
    public void recuperarArchivo() {
        System.out.println("Recuperando archivo localmente... ");
    }
}
