package javaejercio1;

import javax.swing.*;

public class javaEjerc1 {

    public static void main(String[] args){
            System.out.println("Fernando, Valide su contraseña por favor ");
            String clave = "123";
            String pass= "";
                    
            while (clave.equals(pass) == false){
                pass = JOptionPane.showInputDialog("Fer, valide su contraseña, por favor");
                
            if("clave".equals(pass)== false){
            System.out.println("Contraseña Incorrecta");
            }
            }    
                
    System.out.println("Contraseña correcta!!!! Bienvenido al Sistema ");
    }
}