import java.util.ArrayList;
import java.util.Scanner;

class Question2 {

    public static void main(String[] args) {

        int[] vetorDeNumeros = new int[12];

        Scanner scanner = new Scanner(System.in);

        leOScanner(scanner, vetorDeNumeros);
    }

    private static void leOScanner(Scanner scanner, int[] vetor) {
        for (int i = 0; i <= 11; i++) {
            System.out.print("Insira o " + i + "º valor: ");
            vetor[i] = scanner.nextInt();
        }
        int mediaDosValores = retornoDaMedia(vetor);
        informaValoresMaiorQueAMedia(mediaDosValores, vetor);
    }

    private static int retornoDaMedia(int vetor[]) {
        int somaDosValores = 0;
        int mediaDosValores;
        int quantidadeDeValores = vetor.length;

        for (int i = 0; i < quantidadeDeValores; i++) {
            somaDosValores += somaDosValores + vetor[i];
        }

        mediaDosValores = somaDosValores / quantidadeDeValores;

        return mediaDosValores;
    }

    private static void informaValoresMaiorQueAMedia(int mediaDosValores, int[] vetor) {
        ArrayList<Integer> numerosQueSaoMaiorQueAMedia = new ArrayList<Integer>();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > mediaDosValores) {
                numerosQueSaoMaiorQueAMedia.add(vetor[i]);
            }
        }
        for (int i = 0; i < numerosQueSaoMaiorQueAMedia.size(); i++) {
            System.out.println("Valores que são maiores que a média: " + numerosQueSaoMaiorQueAMedia.get(i));
        }
        if (numerosQueSaoMaiorQueAMedia.isEmpty()) {
            System.out.println("Não há valores maiores que a média");
        }
    }

}