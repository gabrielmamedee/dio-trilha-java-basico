package controle_de_fluxo.estruturas_de_repeticao;

public class ExemploBreakContinue {
    public static void main(String[] args) {

        for (int numero = 1; numero <= 8; numero++){
            if (numero == 3)
                continue;
            else if (numero == 5)
                break;

            System.out.println(numero);
        }
    }
}
