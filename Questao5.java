import java.util.Scanner;

public class Questao5 {
public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Escolha a quantidade de valores do array:");
    int n = ler.nextInt();
    int[] array = new int[n];
    
    for (int i = 0; i < n; i++) {
        System.out.print(" Escolha um valor:");
        array[i] = ler.nextInt();
    }
    
    System.out.print("Valores escolhidos:");
    for (int i = 0; i < n; i++) {
        System.out.print(array[i] + " ,");
    }
    
    System.out.println ("");
    System.out.print(" Escolha um valor para buscar:");
    int buscar = ler.nextInt();
    boolean encontrado = false;
    
    for (int i = 0; i < n; i++) {
        if (array[i] == buscar) {
            System.out.println(" Valor encontrado: " + buscar + " em posição " + i + ".");
            encontrado = true;
            break;
        }
    }
    
    if (!encontrado) {
        System.out.println("Valor não encontrado.");
    }
    
}
}
