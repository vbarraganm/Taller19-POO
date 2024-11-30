
package ejercicio1;

public class GestorAutenticacion {
    private ServicioAutenticacion servicioAutenticacion;
    
    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        this.servicioAutenticacion = servicioAutenticacion;
    }
    
    public void autenticarUsuario(String usuario, String contrasena) {
        if (servicioAutenticacion.autenticar(usuario, contrasena)) {
            System.out.println("Autenticación exitosa: " + usuario);
        } else
            System.out.println("Error de autenticación: " + usuario);
    }
}
