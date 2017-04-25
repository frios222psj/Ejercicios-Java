
package javaejerc6;

public class JavaEjerc6 {

    public static void main(String[] args) {
        
        double dolar = 15.90;
        double euro = 17.90;
        String moneda = "dolar";
        int valor = 100;
        double conversion = dolar * valor;
        if(moneda == "dolar"){
            System.out.println(conversion);
        }
        else{
            System.out.println("Operación incorrecta.Ingrese bien la moneda");
        }
    }
    
}
