import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {

        double[] vetorDeNumeros = new double[12];

        Scanner scanner = new Scanner(System.in);

        adicionaValoresNoVetor(vetorDeNumeros, scanner);

        separaNumerosEmImparOuPar(vetorDeNumeros);

        for (int i = 0; i < vetorDeNumeros.length; i++) {
            System.out.println(i + "º número com porcentagem alterada: " + vetorDeNumeros[i]);
        }
    }

    private static void adicionaValoresNoVetor(double[] vetorDeNumeros, Scanner scanner) {
        for (int i = 0; i <= 11; i++) {
            System.out.print("Insira o " + i + "º valor: ");
            vetorDeNumeros[i] = scanner.nextInt();
        }
    }

    private static void separaNumerosEmImparOuPar(double[] vetor) {
        ArrayList<Double> numerosPares = new ArrayList<>();
        ArrayList<Double> numerosImpares = new ArrayList<>();

        for (int i = 0; i < vetor.length; i++) {
            if ((vetor[i] % 2) == 0) {
                numerosPares.add(vetor[i]);
            } else {
                numerosImpares.add(vetor[i]);
            }
        }
        aumentaPorcentagemDeNumerosImpares(numerosImpares, vetor);
        aumentaPorcentagemDeNumerosPares(numerosPares, vetor);
    }

    private static void aumentaPorcentagemDeNumerosPares(ArrayList<Double> numerosPares, double[] vetor) {
        for (int i = 0; i < numerosPares.size(); i++) {
            double porcentagemAumentada = (0.02) * numerosPares.get(i);
            numerosPares.set(i, numerosPares.get(i) + porcentagemAumentada);

            vetor[i] = numerosPares.get(i);
        }
    }

    private static void aumentaPorcentagemDeNumerosImpares(ArrayList<Double> numerosImpares, double[] vetor) {
        for (int i = 0; i < numerosImpares.size(); i++) {
            double porcentagemAumentada = (0.05) * numerosImpares.get(i);
            numerosImpares.set(i, numerosImpares.get(i) + porcentagemAumentada);

            vetor[i] = numerosImpares.get(i);
        }
    }
}
