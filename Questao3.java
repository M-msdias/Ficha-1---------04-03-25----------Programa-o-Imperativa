import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Escolha dois valores inteiros:");
        int numero1 = ler.nextInt();
        int numero2 = ler.nextInt();
        
        if (numero1 > numero2) {
            int gerado = numero1;
            numero1 = numero2;
            numero2 = gerado;
        }
        
        for (int i = numero1 + 1; i < numero2; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
    }
}
