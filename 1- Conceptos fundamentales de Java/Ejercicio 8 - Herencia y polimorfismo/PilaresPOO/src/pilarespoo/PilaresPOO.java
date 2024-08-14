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

        //Instancias de Herencia
        Perro dog = new Perro();
        Gato cat = new Gato();
        Lora lorita = new Lora();

        //Polimorfismo significa varias formas
        //Referenciar 3 objetos a la misma clase
        Animal per = new Perro();
        Animal gat = new Gato();
        Animal lor = new Lora();

        System.out.println(per.sonido("Guau"));
        System.out.println(gat.sonido("Miau"));
        System.out.println(lor.sonido("repite"));

        //Instancia de una clase anidada
    }

}
