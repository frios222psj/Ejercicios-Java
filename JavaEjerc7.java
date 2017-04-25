/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejerc7;

/**
 *
 * @author fer
 */
public class JavaEjerc7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double valor1 = 12;
        double valor2 = 20;
       
        String operacion = "suma";
       
       
        if ("suma".equals(operacion)){
           double resultado = valor1 + valor2;
           System.out.println("El Resultado De La Suma Es " + resultado);
        }
       
       
        if ("resta".equals(operacion)){
           double resultado = valor1 - valor2;
           System.out.println("El Resultado De La Resta Es " + resultado);
        }
       
       
        if ("multiplicacion".equals(operacion)){
           double resultado = valor1 * valor2;
           System.out.println("El Resultado De La Multiplicacion Es " + resultado);
        }
       
       
        if ("division".equals(operacion)){
           double resultado = valor1 / valor2;
           System.out.println("El Resultado De La Division Es " + resultado);
        }   
    }
    
}
