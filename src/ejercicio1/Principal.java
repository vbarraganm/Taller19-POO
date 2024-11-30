
package ejercicio1;

public class Principal {

    public static void main(String[] args) {
        ServicioAutenticacion autenticacionLocal = new AutenticacionLocal();
        GestorAutenticacion gestorLocal = new GestorAutenticacion(autenticacionLocal);
        
        System.out.println("*** Autenticación local ***");
        gestorLocal.autenticarUsuario("valentinab", "12345");
        
        ServicioAutenticacion autenticacion0Auth = new Autenticacion0Auth();
        GestorAutenticacion gestor0Auth = new GestorAutenticacion(autenticacion0Auth);
        
        System.out.println("\n*** Autenticación 0Auth ***");
        gestor0Auth.autenticarUsuario("valentinab0Auth", "67890");
    }
}
