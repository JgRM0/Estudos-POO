public class Main {
    public static void main(String[] args) {

        Turma t = new Turma(new String[] {"Pedro","Carlos","Josue","Ziltom","Renan"}, new byte[] {18,17,12,29,10}, new float[] {10f, 7.2f, 2.1f,8f,9f});

        String[] nomes = t.getAlunosNome();
        byte[] idades = t.getAlunosIdade();
        float[] media = t.getAlunosMedia();
        for(int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i] + ", " + idades[i] + " anos - " + "Média escolar: " + media[i]  );

        }
        System.out.println();
        System.out.println("Idade do mais velho: " + t.alunoMaisVelho());
        System.out.println("Nome do mais novo: " + t.alunoMaisNovo());
        System.out.println("Quantidade de alunos aprovados:  " + t.alunosAprovados());

    }
}
