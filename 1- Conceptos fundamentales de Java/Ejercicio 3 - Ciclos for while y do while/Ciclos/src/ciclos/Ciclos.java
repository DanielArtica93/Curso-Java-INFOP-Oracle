package ciclos;

import java.util.*;

public class Ciclos {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in); 
        
        int n;
        
        System.out.println("Ingresa el número de repeticiones: ");
        n = leer.nextInt();
        
        int i = 0;

        /*
            while (i < n) {
                System.out.println("ORACLE/INFOP: " + i);
                i++;
            }
        */
        
        /*
            do{
                System.out.println("ORACLE/INFOP: " + i);
                i++;
            }while(i<n);
        */
        
        
        for(i = 0; i<n; i++){
            System.out.println("ORACLE/INFOP: " + i);
        }
        
        
        

    }

}
