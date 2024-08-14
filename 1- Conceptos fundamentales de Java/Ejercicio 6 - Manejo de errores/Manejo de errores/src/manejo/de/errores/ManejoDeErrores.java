package manejo.de.errores;

import java.util.*;

public class ManejoDeErrores {

    public static void main(String[] args) {

        //Hay errores de sintaxis, logicos y en tiempo de ejecución
        Scanner leer = new Scanner(System.in);

        try {

            int num = 0;
            int resultado = 0;

            System.out.println("Ingresa un número: ");
            num = leer.nextInt();

            resultado = num / 0;
            //ocurre la excepción o el error

            System.out.println(resultado);

        } catch (Exception e) {
            System.out.println("El error es: " + e);
        }

    }

}
