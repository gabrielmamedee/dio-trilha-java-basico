package controle_de_fluxo.estruturas_de_repeticao;

public class ExemploFor {
    public static void main(String[] args) {
        for(int carneirinhos = 1; carneirinhos <= 20; carneirinhos++){
            String resposta = carneirinhos == 1 ? " carneirinho" : " carneirinhos";
            System.out.println(carneirinhos + resposta );
        }

        System.out.println("Joãozinho dormiu!!");
    }
}
