package controle_de_fluxo.estruturas_condicionais;

public class ResultadoFinalEscolar {
    public static void main(String[] args) {
        int nota = 7;

        if(nota >= 7)
            System.out.println("Aprovado!!");
        else if(nota >= 5 && nota < 7)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");

        //Condição ternária
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
