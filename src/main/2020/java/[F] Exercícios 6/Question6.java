import java.util.Scanner;

class Question6 {

    public static void main(String[] args) {

        int N = 6;
        int[] vetor = new int[N];

        insereValoresNoVetor(vetor);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número: ");

        leOVetor(vetor, scanner.nextInt());

        scanner.close();
    }

    private static void insereValoresNoVetor(int[] vetor) {
        vetor[0] = 1;
        vetor[1] = 12;
        vetor[2] = 5;
        vetor[3] = 76;
        vetor[4] = 54;
        vetor[5] = 99;
    }

    private static void leOVetor(int[] vetor, int numero) {
        if (numeroJaExisteNoVetor(numero, vetor)) {
            System.out.println("Numero já existe no vetor");
        } else {
            System.out.println("Numero NÃO existe no vetor");
        }
    }

    private static boolean numeroJaExisteNoVetor(int numero, int[] vetor) {
        boolean numeroJaEstaCadastrado = false;

        for (int i = 0; i < vetor.length; i++) {
            if (numero == vetor[i]) {
                numeroJaEstaCadastrado = true;
            }
        }
        return numeroJaEstaCadastrado;
    }

}