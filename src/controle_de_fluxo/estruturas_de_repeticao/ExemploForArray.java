package controle_de_fluxo.estruturas_de_repeticao;

public class ExemploForArray {
    public static void main(String[] args) {

        //em arrays o indice inicia em 0
        String alunos[] = {"GABRIEL", "ALICIA", "BENTO", "VICTOR"};

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }

        //forma abreviada utilizando for / each
        for (String aluno : alunos){
            System.out.println("O nome do aluno é: " + aluno);
        }
    }
}
