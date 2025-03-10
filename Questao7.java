public class Questao7 {
    public static void main(String[] args) {
        System.out.println("Asteriscos no formato de triângulo retângulo:");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
