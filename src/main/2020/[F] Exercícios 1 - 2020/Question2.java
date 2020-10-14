import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Informe o primeiro número: ");
            int primeiroNumero = scanner.nextInt();
            
            System.out.print("Informe o segundo número: ");
            int segundoNumero = scanner.nextInt();

            printaOMaiorValor(primeiroNumero, segundoNumero);
        }
    }

    private static void printaOMaiorValor(int primeiroNumero, int segundoNumero) {
        if (primeiroNumero > segundoNumero)
             System.out.println("O primeiro valor (" + primeiroNumero + ") é maior que o segundo valor (" + segundoNumero + ")");
        else
            System.out.println("O segundo valor (" + segundoNumero + ") é maior que o primeiro valor (" + primeiroNumero + ")");
    }
}