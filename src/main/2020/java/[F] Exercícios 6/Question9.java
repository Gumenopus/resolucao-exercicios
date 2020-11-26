import java.util.ArrayList;
import java.util.Scanner;

public class Question9 {

    private static int MASCULINO = 2;
    private static int FEMININO = 1;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Cliente> listaDeClientes = new ArrayList<>();

        // Caso não queira responder as 30 vezes, mude o valor do contador para um valor
        // menor ;)
        int quantidadeDePerguntas = 30;

        for (int i = 0; i <= quantidadeDePerguntas; i++) {
            System.out.println("Informe o seu sexo");
            System.out.println("1 - Feminino");
            System.out.println("2 - Masculino");

            System.out.print("Sua resposta: ");
            int sexoDoUsuario = scanner.nextInt();

            System.out.print("Informe uma nota para o cinema: ");
            int notaDoCinema = scanner.nextInt();

            System.out.print("Informe sua idade: ");
            int idadeDoUsuario = scanner.nextInt();

            Cliente cliente = new Cliente(sexoDoUsuario, notaDoCinema, idadeDoUsuario);
            listaDeClientes.add(cliente);
        }
        System.out.println("A média das notas do cinema foi: " + retornaNotaMediaDoCinema(listaDeClientes));
        System.out.println("A média das notas dos homens: " + retornaNotaMediaDosHomens(listaDeClientes));
        System.out.println("A nota atribuída pela mulher mais jovem foi: " + retornaNotaDaMulherMaisJovem(listaDeClientes));
        System.out.println("Quantidade de mulheres de 50 anos que avaliaram uma nota maior que a média: " + retornaMulheresCinquentaAnos(listaDeClientes));

        scanner.close();
    }

    private static double retornaNotaMediaDoCinema(ArrayList<Cliente> listaDeClientes) {
        double mediaDoCinema = 0;
        int notasTotal = 0;
        int quantidadeDeNotasRegistradas = listaDeClientes.size();

        for (int i = 0; i < listaDeClientes.size(); i++) {
            notasTotal += listaDeClientes.get(i).notaDoCinema;
        }
        mediaDoCinema = notasTotal / quantidadeDeNotasRegistradas;

        return mediaDoCinema;
    }

    private static int retornaNotaMediaDosHomens(ArrayList<Cliente> listaDeClientes) {
        int notasTotaisDosHomens = 0;

        ArrayList<Cliente> listaApenasComHomens = new ArrayList<>();

        for (int i = 0; i < listaDeClientes.size(); i++) {
            if (listaDeClientes.get(i).sexo == MASCULINO) {
                notasTotaisDosHomens += listaDeClientes.get(i).notaDoCinema;
                listaApenasComHomens.add(listaDeClientes.get(i));
            }
        }
        int notaMediaDosHomens = notasTotaisDosHomens / listaApenasComHomens.size();

        if (listaApenasComHomens.isEmpty()) {
            return 0;
        } else {
            return notaMediaDosHomens;
        }
    }

    private static int retornaNotaDaMulherMaisJovem(ArrayList<Cliente> listaDeClientes) {
        int idadeDaMulherMaisJovem = Integer.MAX_VALUE;
        int notaDaMulherMaisJovem = 0;

        for (int i = 0; i < listaDeClientes.size(); i++) {
            if (listaDeClientes.get(i).sexo == FEMININO && listaDeClientes.get(i).idade < idadeDaMulherMaisJovem) {
                idadeDaMulherMaisJovem = listaDeClientes.get(i).idade;
                notaDaMulherMaisJovem = listaDeClientes.get(i).notaDoCinema;
            }
        }
        return notaDaMulherMaisJovem;
    }

    private static int retornaMulheresCinquentaAnos(ArrayList<Cliente> listaDeClientes) {
        /**
         * Quantidade de mulheres acima de 50 anos que deram uma nota superior à media.
         */
        int quantidadeDeMulheresCinquentaAnos = 0;

        for (int i = 0; i < listaDeClientes.size(); i++) {
            if (listaDeClientes.get(i).idade > 50 && listaDeClientes.get(i).notaDoCinema > retornaNotaMediaDoCinema(listaDeClientes)) {
                quantidadeDeMulheresCinquentaAnos++;
            }
        }
        return quantidadeDeMulheresCinquentaAnos;
    }

    static class Cliente {
        int sexo;
        int notaDoCinema;
        int idade;

        public Cliente(int sexo, int notaDoCinema, int idade) {
            this.sexo = sexo;
            this.notaDoCinema = notaDoCinema;
            this.idade = idade;
        }
    }
}
