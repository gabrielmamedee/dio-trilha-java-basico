package controle_de_fluxo;

public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T";

        switch (plano){
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("Whats a Intagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
