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
                System.out.println("Salário total: " + ( (quantidadeDeHorasTrabalhadas - 160) * (valorPorHora / 2 + valorPorHora) + (160 * valorPorHora)) );
            } else {
                System.out.println("Salário total: " + quantidadeDeHorasTrabalhadas * valorPorHora);
            }
        }
    }
}