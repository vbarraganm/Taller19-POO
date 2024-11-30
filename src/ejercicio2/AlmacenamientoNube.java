
package ejercicio2;

public class AlmacenamientoNube implements Almacenamiento {
    @Override
    public void guardarArchivo() {
        System.out.println("Guardando archivo en la nube...  ");
    }
    
    @Override
    public void recuperarArchivo() {
        System.out.println("Recuperando archivo de la nube... ");
    }
}
