//Referencia al paquete que pertenece
package pilarespoo;

//Importar todo lo que contiene el paquete llamado prueba
import prueba.*;

//clase objeto
public class PilaresPOO {

    //clase principal
    public static void main(String[] args) {

        //instancia de la clase Persona    
        Persona per1 = new Persona();
        Animal an = new Animal();
        
        //per1.saludo();
        
        per1.setDNI(2024);
        per1.setDNI(2025);
        per1.setDNI(2030);
        System.out.println(+per1.getDNI());
        
        per1.saludo();
        
        an.prueba();
        
        //Llamada a los métodos sobrecargados
        //Sumar enteros 2 números
        System.out.println(+per1.suma(2, 4));
        
        //Sumar doubles 2 números
        System.out.println(+per1.suma(2.5, 4.3));
        
        //sumar 3 valores dobles
        System.out.println(+per1.suma(1.2, 1.2, 1.2));
        
        //sumar 3 valores enteros
        System.out.println(+per1.suma(1, 1, 1));
                
    }

}
