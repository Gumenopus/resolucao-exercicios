import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Informe uma letra: ");
            String letra = scanner.nextLine();

            if (letraEVogal(letra.toUpperCase()))
                System.out.println("É uma vogal.");
            else
                System.out.println("Não é uma vogal.");
        }
    }

    private static boolean letraEVogal(String letra) {
        return letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U");
    }
}
