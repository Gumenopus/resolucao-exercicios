import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("A cor é azul? R.: ");
            // Variável lógica
            boolean verdadeiroOuFalso = scanner.nextBoolean();

            try {
                // Programa lendo a variável lógica
                System.out.println(retornaTrueOuFalse(verdadeiroOuFalso));
            } catch (Exception e) {
                System.out.println("Ops! Houve um problema: " + e.toString());
            }
        }
    }

    private static String retornaTrueOuFalse(boolean resposta) {
        if (resposta) {
            return "Sim";
        } else {
            return "Não";
        }
    }

}