package controle_de_fluxo.estruturas_condicionais;

public class ResultadoEscolar {
    public static void main(String[] args) {

        int nota = 8;

        if(nota >= 7)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");

        //Condição ternária
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
    }
}
