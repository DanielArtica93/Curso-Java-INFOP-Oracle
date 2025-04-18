package proyecto2;

import java.util.Random;

public class ComputeMethods {
    
    public double fToC(double degreesF) {
        return (degreesF - 32) * 5 / 9;
    }
    
    public double hypotenuse(int a, int b) {
        return Math.sqrt(a*a) + Math.sqrt(b*b);
    }
    
    public int roll(){
        Random rand = new Random();
        int dado1 = rand.nextInt(6) + 1;    //busca un valor aletorio entre 1 y 6 al dado 1
        int dado2 = rand.nextInt(6) + 1;    //busca un valor aleatorio entre 1 y 6 al dado 2
        
        return dado1 + dado2;
    }
    
}
