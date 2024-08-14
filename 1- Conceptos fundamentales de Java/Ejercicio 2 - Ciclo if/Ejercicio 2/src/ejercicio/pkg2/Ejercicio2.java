package ejercicio.pkg2;

import java.util.*;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        //instanciar la clase de lectura de ingreso de teclado
        Scanner leer = new Scanner(System.in);
        
        double nota = 0;
                
        System.out.print("Ingrese la nota: ");
        nota = leer.nextDouble();
        
        if(nota >= 70 && nota <= 100){
            System.out.println("Aprobaste la primera certificación de Java Oracle");
        }
        else
            System.out.println("No aprobaste");
        
                
    }
    
}
