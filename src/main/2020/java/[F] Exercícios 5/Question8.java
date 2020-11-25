import java.util.ArrayList;

public class Question8 {
    public static void main(String[] args) {

        int N = 6;
        int[] numeros = new int[N];

        adicionaItensNoVetor(numeros);

        System.out.println("A média dos números positivos é: " + retornaMediaDosNumerosPositivos(numeros));
        System.out.println("O menor valor negativo é: " + retornaOMenorValorNegativo(numeros));
    }

    private static void adicionaItensNoVetor(int[] numeros) {
        numeros[0] = 1;
        numeros[1] = 3;
        numeros[2] = 6;
        numeros[3] = -978;
        numeros[4] = -43;
        numeros[5] = -937;
    }

    private static double retornaMediaDosNumerosPositivos(int[] numeros) {
        int somaTotalDeNumerosPositivos = 0;
        int quantidadeDeNumerosPositivos = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                System.out.println(numeros[i]);
                somaTotalDeNumerosPositivos += numeros[i];
                quantidadeDeNumerosPositivos++;
            }
        }
        return somaTotalDeNumerosPositivos / quantidadeDeNumerosPositivos;
    }

    private static int retornaOMenorValorNegativo(int numeros[]) {
        ArrayList<Integer> numerosNegativos = new ArrayList<Integer>();
        int menorValorDoNumeroNegativo = Integer.MAX_VALUE;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                numerosNegativos.add(numeros[i]);
            }
        }
        for (int i = 0; i < numerosNegativos.size(); i++) {
            if (numerosNegativos.get(i) < menorValorDoNumeroNegativo) {
                menorValorDoNumeroNegativo = numerosNegativos.get(i);
            }
        }
        return menorValorDoNumeroNegativo;
    }
}