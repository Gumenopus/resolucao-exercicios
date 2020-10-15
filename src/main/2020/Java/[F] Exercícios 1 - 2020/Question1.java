import java.util.Scanner;

class Question1 {

    static int quantidadeDeHorasMensais = 160;

    public static void main(final String[] args) {

        final Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Quantas horas o funcionário trabalhou no mês: ");
            int quantidadeDeHorasTrabalhadas = scanner.nextInt();

            System.out.print("Valor por hora do funcionário: ");
            int valorPorHora = scanner.nextInt();

            if (quantidadeDeHorasTrabalhadas > 160) {

                // int horasExtras = quantidadeDeHorasTrabalhadas - 160;
                // int cinquentaPorcentoDoSalario = valorPorHora / 2 + valorPorHora;

                // int valorFinalHoraExtra =  horasExtras * cinquentaPorcentoDoSalario;
                // int valorFinal = 160 * valorPorHora + valorFinalHoraExtra;

                System.out.println("Salário total: " + ( (quantidadeDeHorasTrabalhadas - 160) * (valorPorHora / 2 + valorPorHora) + (160 * valorPorHora)) );
            } else {
                System.out.println("Salário total: " + quantidadeDeHorasTrabalhadas * valorPorHora);
            }

            // System.out.println("Salário do funcionário sem horas extras: R$" +
            // calculaHoraPadrao(valorPorHora));

            // System.out.println("Horas extras do funcionário: R$" +
            // calculaHoraExtra(quantidadeDeHorasTrabalhadas, valorPorHora));

            // System.out.println("Salário total do funcionário: R$"+
            // calculaSalarioTotal(quantidadeDeHorasTrabalhadas, valorPorHora));
        }
    }

    private static int calculaHoraExtra(int quantidadeDeHorasTrabalhadas, int valorPorHora) {
        int horasExtrasTrabalhadas = quantidadeDeHorasTrabalhadas - quantidadeDeHorasMensais;
        int cinquentaPorcentoDoSalario = valorPorHora / 2;

        int valorExtra = valorPorHora + cinquentaPorcentoDoSalario;
        int totalDoValorExtra = valorExtra * horasExtrasTrabalhadas;

        return totalDoValorExtra;
    }

    private static int calculaHoraPadrao(int valorPorHora) {
        return quantidadeDeHorasMensais * valorPorHora;
    }

    private static int calculaSalarioTotal(int quantidadeDeHorasTrabalhadas, int valorPorHora) {
        return calculaHoraPadrao(valorPorHora) + calculaHoraExtra(quantidadeDeHorasTrabalhadas, valorPorHora);
    }
}