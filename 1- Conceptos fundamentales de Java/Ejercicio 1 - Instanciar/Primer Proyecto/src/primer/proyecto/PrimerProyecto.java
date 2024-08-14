// Paquete por defecto dónde se encuentra la clase controladora
package primer.proyecto;

// Clase controladora
public class PrimerProyecto {
    
    // Método principal
    public static void main(String[] args) {
        
        // Instanciar las clases de objeto

        // Tipos de datos en java

        //convertir de entero a double
        int num1 = 36;
        System.out.println((double) num1);
    
        // Rango entre o y 10
        System.out.println( Math.random() * 10 );
     
        //sacar raíz cuadrada
        System.out.println( Math.sqrt(num1));
        
        // Declaración de varios string en una línea
        String nombre1, nombre2;
        nombre1 = "Antonio";
        nombre2 = "Daniel";
        
        System.out.println(nombre1 + "\n" + nombre2);
        
        //método compareto
        System.out.println(nombre1.compareTo(nombre2));
        
        //contar el número de caracteres
        System.out.println(nombre1.length());
        
        //método substring - omitir letras de la izquierda
        System.out.println( nombre1.substring(1) );
        System.out.println( nombre1.substring(2, 4 ) );
        
        //encontrando el dominio del correo
        //buecar todo lo que tenga un @
        String correo = "articadaniel1993@gmail.com";
        //ahora desde dónde encontres una d empeza a imprimir
        int position = correo.indexOf('d');
        //imprimime todos los @
        String domain = correo.substring(position);
        System.out.println(domain);
        
      
    }
    
}
