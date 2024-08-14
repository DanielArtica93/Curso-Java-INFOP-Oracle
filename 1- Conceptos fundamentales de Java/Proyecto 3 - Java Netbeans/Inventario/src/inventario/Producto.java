
package inventario;

public class Producto {
    
     //Variables
    private int id = 0;
    private String nombre = "";
    private int unidades = 10;
    private double precio = 0.0;
    
    //Get y Set

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
     //Constructores
       public Producto(){}
       
       public Producto(int id, String nombre, int unidades, double precio){
           
           this.id = id;
           this.nombre = nombre;
           this.precio = precio;
           this.unidades = unidades;
           
       }
    
    //Métodos
       public void imprimir(){
                       
           this.setId(1);
           this.setNombre("Carne Molida");
           this.setPrecio(60.5);
           this.setUnidades(1);
           
           System.out.println("\nFACTURA\n");
           
           System.out.println("Número elemento: " + this.getId());
           System.out.println("Nombre de producto: " + this.getNombre());
           System.out.println("Unidades que lleva: " + this.getUnidades());
           System.out.println("Precio del producto: " + this.getPrecio());
       }
    
    //Clases anidadas
    
}