import java.util.ArrayList;

public class Question9 {
    public static void main(String[] args) {
        Aluno[] quantidadeDeAlunos = new Aluno[4];

        ArrayList<Aluno> alunosDeDezoitoAnos = new ArrayList<Aluno>();
        ArrayList<Aluno> alunosMaiorVinteAnos = new ArrayList<Aluno>();

        adicionaAlunosNoVetor(quantidadeDeAlunos);

        adicionaAlunosComDezoitoAnos(quantidadeDeAlunos, alunosDeDezoitoAnos);
        adicionaAlunosComVinteAnos(quantidadeDeAlunos, alunosMaiorVinteAnos);

        for (int i = 0; i < alunosDeDezoitoAnos.size(); i++) {
            System.out.println("Alunos que tem 18 anos: " + alunosDeDezoitoAnos.get(i).nome);
        }

        System.out.println("Alunos que tem mais de 20 anos: " + alunosMaiorVinteAnos.size());
    }

    private static void adicionaAlunosNoVetor(Question9.Aluno[] quantidadeDeAlunos) {
        Aluno aluno1 = new Aluno("Thiago Rodrigues", 21);
        Aluno aluno2 = new Aluno("Gustavo, vulgo Gumenopus", 17); // almost there!
        Aluno aluno3 = new Aluno("Marcos", 18);
        Aluno aluno4 = new Aluno("Antonio nunes", 21);

        quantidadeDeAlunos[0] = aluno1;
        quantidadeDeAlunos[1] = aluno2;
        quantidadeDeAlunos[2] = aluno3;
        quantidadeDeAlunos[3] = aluno4;
    }

    private static void adicionaAlunosComDezoitoAnos(Question9.Aluno[] quantidadeDeAlunos,
            ArrayList<Aluno> alunosComDezoitoAnos) {
        for (int i = 0; i < quantidadeDeAlunos.length; i++) {
            if (quantidadeDeAlunos[i].idade == 18) {
                alunosComDezoitoAnos.add(quantidadeDeAlunos[i]);
            }
        }
    }

    private static void adicionaAlunosComVinteAnos(Question9.Aluno[] quantidadeDeAlunos,
            ArrayList<Question9.Aluno> alunosComVinteAnos) {
        for (int i = 0; i < quantidadeDeAlunos.length; i++) {
            if (quantidadeDeAlunos[i].idade > 20) {
                alunosComVinteAnos.add(quantidadeDeAlunos[i]);
            }
        }
    }

    public static class Aluno {
        String nome;
        int idade;

        public Aluno(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }
    }
}
