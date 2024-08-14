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

    //Métodos
    //Si se usa protected o private no se puede llamar desde la clase Main
      /*
    Mètodo que devuelve acciones
    si uso public o protected en el método lo puedo utilizar por que pertenecen a la misma clase y mismo paquete
    si uso private o protected aquí no lo puedo llamar desde el main
     */
    public void prueba() {
        System.out.println("Guau, miau, oingt");
    }

}
