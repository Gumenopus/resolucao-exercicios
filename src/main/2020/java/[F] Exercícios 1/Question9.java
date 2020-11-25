import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Informe o ano de nascimento do 1º irmão: ");
            int anoDoPrimeiroIrmao = scanner.nextInt();

            System.out.print("Informe o ano de nascimento do 2º irmão: ");
            int anoDoSegundoIrmao = scanner.nextInt();

            System.out.print("Informe o ano de nascimento do 3º irmão: ");
            int anoDoTerceiroIrmao = scanner.nextInt();

            System.out.println("Eles são " + irmaosSaoGemeosOuTrigemeos(anoDoPrimeiroIrmao, anoDoSegundoIrmao, anoDoTerceiroIrmao));
        }
    }    

    private static String irmaosSaoGemeosOuTrigemeos(int anoDoPrimeiroIrmao, int anoDoSegundoIrmao, int anoDoTerceiroIrmao) {

        String genetica = null;
        
        if (anoDoPrimeiroIrmao == anoDoSegundoIrmao || anoDoPrimeiroIrmao == anoDoTerceiroIrmao) {
            genetica = "gêmeos";
        }        
        if (anoDoSegundoIrmao == anoDoPrimeiroIrmao || anoDoSegundoIrmao == anoDoTerceiroIrmao) {
            genetica = "gêmeos";
        }
        if (anoDoTerceiroIrmao == anoDoPrimeiroIrmao || anoDoTerceiroIrmao == anoDoSegundoIrmao) {
            genetica = "gêmeos";
        }

        if (anoDoTerceiroIrmao != anoDoPrimeiroIrmao && anoDoTerceiroIrmao != anoDoSegundoIrmao) {
            genetica = "apenas irmãos";
        }

        if (anoDoPrimeiroIrmao == anoDoSegundoIrmao && anoDoPrimeiroIrmao == anoDoTerceiroIrmao) {
            genetica = "trigêmeos";
        }

        return genetica;
    }

}
