package controle_de_fluxo.estruturas_de_repeticao;
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;
        }
    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
