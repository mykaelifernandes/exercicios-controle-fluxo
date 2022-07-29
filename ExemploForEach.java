public class ExemploForEach {

    public static void main(String[] args) {

        // Em arrays o índice inicia em ZERO
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
