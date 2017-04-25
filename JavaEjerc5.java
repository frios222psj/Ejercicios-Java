package javaejerc5;

public class JavaEjerc5 {

    public static void main(String[] args) {
        
        int nota1 = 7;
        int nota2 = 7;
        int nota3 = 1;
        int nota4 = 7;
        int nota5 = 7;
        int promedio = (nota1 + nota2 + nota3 + nota4 + nota5)/5;
        
        if(promedio >= 7){
            System.out.println("Materia aprobada. Su promedio es de: " + promedio);
        }
        else{
            System.out.println("Materia reprobada. Su promedio es de: " + promedio);
        }
        
    }
    
}
