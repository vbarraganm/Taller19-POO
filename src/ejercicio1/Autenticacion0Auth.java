
package ejercicio1;

public class Autenticacion0Auth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contrasena) {
        System.out.println("Autenticando al usuario por medio de 0Auth: " + usuario);
        return "valentinab0Auth".equals(usuario) && "67890".equals(contrasena);
    }
}
