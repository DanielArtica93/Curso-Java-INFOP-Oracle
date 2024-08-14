package matrices.dimensionales;

import java.util.*;

public class MATRICESDIMENSIONALES {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        //matriz unidimensional
        String[][] nombre = new String[2][3];
        
        nombre[0][0] = "Argeni";
        nombre[0][1] = "Daniel";
        
        nombre[1][0] = "Juan";
        nombre[1][1] = "Nancy";
            
        for(int f=0; f<nombre.length; f++){
            for(int c=0; c<nombre.length ; c++){
                System.out.println("Nombres: " + nombre[f][c] );
            }
        }
        
    }
    
}
