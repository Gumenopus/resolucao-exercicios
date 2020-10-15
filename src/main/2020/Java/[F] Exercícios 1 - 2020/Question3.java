import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Informe um valor maior que 0: ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                System.out.println(numeroImparOuPar(numero));
            } else {
                System.out.println("Este número é inválido.");
            }
        }
    }

    private static String numeroImparOuPar(int numero) {
        if (numero % 2 == 0)
            return "Par";
        else
            return "Ímpar";
    }
}