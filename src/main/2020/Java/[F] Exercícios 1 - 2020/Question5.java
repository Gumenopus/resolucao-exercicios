import java.util.Scanner;

class Question5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Informe o caractere de gênero: ");
            String palavra = scanner.nextLine();

            if (palavraEValida(palavra.toLowerCase())) {
                System.out.println(retornaCaractereAbreviado(palavra.toUpperCase()));
            } else {
                System.out.println("Entrada incorreta.");
            }
        }
    }

    private static String retornaCaractereAbreviado(String palavra) {
        if (palavra.equals("M")) {
            return "Masculino.";
        }
        if (palavra.equals("F")) {
            return "Feminino.";
        }
        if (palavra.equals("I")) {
            return "Não informado.";
        }
        return null;
    }

    private static boolean palavraEValida(String palavra) {
        return !palavra.isEmpty() && palavra.equals("m") || palavra.equals("f") || palavra.equals("i");
    }
}