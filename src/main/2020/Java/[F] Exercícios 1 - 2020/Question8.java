import java.util.ArrayList;
import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            System.out.print("Informe a idade de Marquinhos: ");
            int idadeDeMarquinhos = scanner.nextInt();

            System.out.print("Informe a idade de Zezinho: ");
            int idadeDeZezinho = scanner.nextInt();

            System.out.print("Informe a idade de Luluzinha: ");
            int idadeDeLuluzinha = scanner.nextInt();

            System.out.println("O caçula da família é: "
                    + defineCaculaDaFamilia(idadeDeMarquinhos, idadeDeZezinho, idadeDeLuluzinha));
        }
    }

    private static String defineCaculaDaFamilia(int idadeDeMarquinhos, int idadeDeZezinho, int idadeDeLuluzinha) {

        String nomeDoCacula = null;
        int idadeDoCacula = Integer.MAX_VALUE;

        if (idadeDeMarquinhos < idadeDoCacula) {
            nomeDoCacula = "Marquinhos";
            idadeDoCacula = idadeDeMarquinhos;
        }

        if (idadeDeZezinho < idadeDoCacula) {
            nomeDoCacula = "Zezinho";
            idadeDoCacula = idadeDeZezinho;
        }

        if (idadeDeLuluzinha < idadeDoCacula) {
            nomeDoCacula = "Luluzinha";
            idadeDoCacula = idadeDeLuluzinha;
        }
        return nomeDoCacula;
    }
}
