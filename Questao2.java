import java.util.Random;

public class Questao2 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[] numeros = new int[20];
        System.out.println("Valores e os que os sucedem.:");
        
        for (int i = 0; i < 20; i++) {
            numeros[i] = aleatorio.nextInt(101);
            System.out.println(numeros[i] + " -> " + (numeros[i] + 1));
        }
    }
}

    
