
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha seis letras:");
        char[] letras = new char[6];

        double consoantes = 0;
        for (int i = 0; i < 6; i++) {
            letras [i] = ler.next().charAt(0);
            if ((letras[i] >= 'a' && letras[i] <= 'z') || (letras[i] >= 'A' && letras[i] <= 'Z')) {
                if (letras[i] != 'a' && letras[i] != 'e' && letras[i] != 'i' && letras[i] != 'o' && letras[i] != 'u' &&
                letras[i] != 'A' && letras[i] != 'E' && letras[i] != 'I' && letras[i] != 'O' && letras[i] != 'U') {
                    consoantes++;
                    System.out.print(letras[i] + " ");
                }
            }
        }
        System.out.println("\nCaracteres lidas: " + consoantes);
        
    }
}
