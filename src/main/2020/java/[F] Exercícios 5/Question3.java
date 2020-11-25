public class Question3 {
    
    public static void main(String[] args) {
        System.out.println("A soma total da série é: " + retornaSomaDaSerie());
    }

    private static int retornaSomaDaSerie() {
        int dominador = 1;
        int denominador = 1;

        int resultadoDaDivisao = dominador / denominador;
        int somaTotal = 0;

        for (int i = 0; i <= 100; i++) {
            somaTotal += resultadoDaDivisao;

            denominador++;
        }
        return somaTotal;
    }

}