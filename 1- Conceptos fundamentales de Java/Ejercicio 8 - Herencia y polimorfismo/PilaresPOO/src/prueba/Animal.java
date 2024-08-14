/*
    public se puede utilizar en todo el proyecto
    protected sólo en el mismo paquete
    private sólo en la misma clase
    encapsulamiento es jugar con los modificadores de acceso
 */
package prueba;

public class Animal {

    //Variables
    public int id = 0;
    public String raza = "";
    public String nombre = "";
    public int edad = 0;

    //Get y set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Constructores
    //Para poder utilizar la clase
    public Animal() {
    }

    //Constructor para poder instanciar las variables
    public Animal(int id, String raza, String nombre, int edad) {
        this.id = id;
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
    }

    //Herencia
    public String sonido(String sonido){
        return sonido;
    }

    //Clase anidada
    public class perroAnidado{
        
    }
    
    public class gatoAnidado{
        
    }
    
    public class loraAnidada{
        
    }
    
}
