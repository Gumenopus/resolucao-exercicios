public class Question4 {

    public static void main(String[] args) {
        System.out.println("O valor de S é: " + retornaSomaDoS());
    }
    private static int retornaSomaDoS() {
        int dominador = 3;
        int denominador = 2;

        int somaTotalDaDivisao = 0;
        int aumentoLogico = 2;

        for (int i = 0; i <= 20; i++) {
            somaTotalDaDivisao += dominador / denominador;
            dominador += 2;
            aumentoLogico += 2;

            denominador += denominador + aumentoLogico;
        }
        return somaTotalDaDivisao;
    }
}
