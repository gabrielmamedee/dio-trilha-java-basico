public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "Gabriel " + "Mamede";
        System.out.println(nomeCompleto);

        int numero = 5;
        numero = - numero;
        System.out.println(numero);
        numero = numero * -1;
        System.out.println(numero);

        //x repeticao
        int valor = 5;
        valor++;
        System.out.println(valor);
        System.out.println(++valor);

        //negacao
        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);

        //ternário
        int a, b;

        a = 6;
        b = 6;

        /* Com if else
        String resultado = "";

        if (a==b)
            resultado = "Verdadeiro";
        else
            resultado = "Falso";
         */

        String resultado = a==b ? "Verdadeiro" : "Falso";

        System.out.println(resultado);
    }
}
