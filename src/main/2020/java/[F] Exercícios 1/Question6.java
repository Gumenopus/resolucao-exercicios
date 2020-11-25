import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Informe o peso da carta: ");
            float pesoDaCarta = scanner.nextFloat();

            System.out.println("Valor da carta: R$" + retornaPrecoDaCarta(pesoDaCarta));
        }
    }

    private static double retornaPrecoDaCarta(float pesoDaCarta) {

        if (pesoDaCarta <= 50) {
            return 0.45;
        }

        if (pesoDaCarta >= 51) {

            float quantidadeDe20Gramas = 0;
            float pesoAdicionalDaCarta = pesoDaCarta - 50;

            if (pesoAdicionalDaCarta >= 20) {
                quantidadeDe20Gramas = pesoAdicionalDaCarta / 20;
            }

            float valorAdicional = (float) (quantidadeDe20Gramas * 0.45);
            valorAdicional += 0.45;

            return valorAdicional;
        }
        return 0;
    }
}
