// Sistema de plano telefônico
// 3 planos : Basic,Midia,Turbo
// Basic: 100 minutos de ligação
// Midia: 100 minutos de ligação + whats e Insta grátis
// Turbo: 100 minutos de ligação + whats e Insta grátis + 5gb de Youtube
// 
public class PlanoOperadora {

    public static void main(String[] args) {
        String plano = "M";

        if (plano == "B") {
            System.out.println("100 minutos de ligação");
        } else if (plano == "M") {
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Instagram grátis");
        } else if (plano == "T") {
            System.out.println("100 minutos de ligação");
            System.out.println("whats e Instagram grátis");
            System.out.println("5gb de Youtube");
        }
    }
}