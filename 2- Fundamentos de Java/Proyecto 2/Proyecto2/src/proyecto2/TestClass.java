package proyecto2;

public class TestClass {
    
    public static void main(String[] args) {
      
        //Instancia de la clase ComputeMethods
        ComputeMethods cm = new ComputeMethods();
        
        //Llamada al método fToc y mostrar el resultado
        double tempCelsius = cm.fToC(100); // ejemplo utilizando 100 grados farenheit
        System.out.println("La temperatura en grados celcius es: " + tempCelsius);
        
        //Llamar al método hypotenuse y mostrar el resultado
        double hypotenuse = cm.hypotenuse(6, 8);
        System.out.println("La hipotenusa es: " + hypotenuse);
        
        //Llamar al método roll y mostrar el resultado
        int diceRoll = cm.roll();
        System.out.println("La suma de los números de los dados es: " + diceRoll);
        
    }
    
}