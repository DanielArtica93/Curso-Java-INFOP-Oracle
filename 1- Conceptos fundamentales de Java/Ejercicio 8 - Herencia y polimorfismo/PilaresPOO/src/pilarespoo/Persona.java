/*
    public se puede utilizar en todo el proyecto
    protected sólo en el mismo paquete
    private sólo en la misma clase
    encapsulamiento es jugar con los modificadores de acceso
 */

package pilarespoo;

import java.util.Scanner;

public class Persona {

    //modificador de acceso: Public, private y protected
    //Variables
    public int DNI = 1993;
    public String nombre = "Daniel";
    public String apellido = "";
    public int edad = 0;
    public double peso = 0.0;

    //Get obtener el valor de la variable 
    //set asignar el valor a una variable
    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //constructor para utilizar la clase
    public Persona() {
    }

    //constructor para utilizar los métodos o variables de la clase
    public Persona(int DNI, String nombre, String apellido, int edad, double peso) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
    }

    /*
    Mètodo que devuelve acciones
    si uso public o protected en el método lo puedo utilizar por que pertenecen a la misma clase y mismo paquete
    si uso private o protected aquí no lo puedo llamar desde el main
    El método void significa que me va a devolver una respueta inmediata 
    */
    public void saludo() {
        this.setNombre("Antonio");
        this.setNombre("Artica");
        System.out.println("Hola: " + this.getNombre());
    }

    //Métodos que devuelven información
    //Método con parámetros
    public double suma(double num1, double num2){
        
        double total = num1 + num2;
        return total;
    }    
    
    //Sobrecarga de métodos
    public int suma(int num1, int num2){
        int total = num1 + num2;
        return total;
    }
    
     public double suma(double num1, double num2, double num3){
        double total = num1 + num2 + num3;
        return total;
    }
     
       public int suma(int num1, int num2, int num3){
        int total = num1 + num2 + num3;
        return total;
    }
    
}
