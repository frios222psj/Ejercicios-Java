package javaejerc3;

public class JavaEjerc3 {

    public static void main(String[] args) {
        
        String opera = "Contado";
        int valor = 1500;
        float desc = (valor * 10) / 100;
        float v_Final = valor - desc;
        
        if("Contado".equals(opera)){
            System.out.println("La operación tiene descuento.Importe a Abonar : " + v_Final);
        }
        else{
            System.out.println("Esta operación no tiene descuento.");
        }   

    }
    
}
