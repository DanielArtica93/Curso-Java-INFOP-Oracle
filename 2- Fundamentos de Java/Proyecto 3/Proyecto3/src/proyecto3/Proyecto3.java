
package proyecto3;

public class Proyecto3 {

    public static void main(String[] args) {
        
        // Llamadas a los métodos con diferentes dimensiones
        System.out.println("Rectangulo de 5x4:");
        createRectangle(5, 4);

        System.out.println("\nTriangulo rectangulo isosceles de tamano 5:");
        createTriangle(5);
        
        // Puedes cambiar las dimensiones para probar como se forma el rectangulo
        System.out.println("\nRectangulo de 1x1:");
        createRectangle(1, 1);

        System.out.println("\nTriangulo rectangulo isosceles de tamano: 3");
        createTriangle(3);
        
    }
       
    // Método para crear un rectángulo de tamaño personalizado
    public static void createRectangle(int width, int height) {
        // Validación: Evitar dimensiones menores a 1
        if (width < 1 || height < 1) {
            System.out.println("Las dimensiones deben ser mayores o iguales a 1.");
            return;
        }

        // Bucle para dibujar el rectángulo
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("#");
            }
            System.out.println(); // Cambiar de línea después de cada fila
        }
    }

    // Método para crear un triángulo rectángulo isósceles de tamaño personalizado
    public static void createTriangle(int size) {
        // Validación: Evitar dimensiones menores a 1
        if (size < 1) {
            System.out.println("El tamaño debe ser mayor o igual a 1.");
            return;
        }

        // Bucle para dibujar el triángulo rectángulo isósceles
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println(); // Cambiar de línea después de cada fila
        }
    }
    
}   