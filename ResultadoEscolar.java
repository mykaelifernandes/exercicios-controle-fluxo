public class ResultadoEscolar {

    public static void main(String[] args) {
        int nota = 10;

        if (nota >= 7) {
            System.out.println("Aprovado!"); // precisa retornar true
        }

        else if (nota > 5 && nota < 7)
            System.out.println("Prova de recuperação!"); // tem que retornar true ou false

        else
            System.out.println("Reprovado!");

    }

}