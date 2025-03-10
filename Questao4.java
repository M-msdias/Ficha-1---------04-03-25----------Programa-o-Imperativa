import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite as strings. Se quiser parar digite duas iguais seguidas:");
        String anterior = "", atual;
        int contador = 0;
        String concatenadas = "";
        int maiorTamanho = 0;
        
        while (true) {
            atual = ler.next();
            contador++;
            if (atual.length() > maiorTamanho) {
                maiorTamanho = atual.length();
            }
            if (contador > 1) {
                concatenadas += anterior;
            }
            if (atual.equals(anterior)) {
                break;
            }
            anterior = atual;
        }
        
        System.out.println("Quantidade de Strings lidas: " + contador);
        System.out.println("A maior strings: " + maiorTamanho);
        System.out.println("Concatenação: " + concatenadas);
        
    }
}
