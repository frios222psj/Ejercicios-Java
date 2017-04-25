package javaejerc4;

public class JavaEjerc4 {

    public static void main(String[] args) {
        String user = "admin";
        String clave = "Admin";
        if (user == "admin") {
            if (clave == "Admin") {
                System.out.println("Bienvenido Administrador.");
            } else {
                System.out.println("Clave incorrecta.");
            }
        } else {
            System.out.println("Usuario desconocido.");
        }
    }
    
}
