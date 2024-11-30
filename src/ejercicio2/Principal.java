
package ejercicio2;

public class Principal {
    public static void main(String[] args) {
        Almacenamiento almacenamientoLocal = new AlmacenamientoLocal();
        Almacenamiento almacenamientoNube = new AlmacenamientoNube();
        
        GestorArchivos gestorLocal = new GestorArchivos(almacenamientoLocal);
        GestorArchivos gestorNube = new GestorArchivos(almacenamientoNube);
        
        System.out.println("*** Almacenamiento local ***");
        gestorLocal.guardarArchivo();
        gestorLocal.recuperarArchivo();
        
        System.out.println("\n*** Almacenamiento en la nube ***");
        gestorNube.guardarArchivo();
        gestorNube.recuperarArchivo();
    }
}
