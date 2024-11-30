
package ejercicio1;

public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contrasena) {
        System.out.println("Autenticando al usuario localmente: " + usuario);
        return "valentinab".equals(usuario) && "12345".equals(contrasena);
    }
}
