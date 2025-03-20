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

        //relacionais
        int numero1 = 1;
        int numero2 = 2;

        if(numero1 == numero2)
            System.out.println("numeroUm é igual a numeroDois? ");
        if (numero1 != numero2)
            System.out.println("numeroUm é diferente a numeroDois? ");
        if (numero1 > numero2)
            System.out.println("numeroUm é maior a numeroDois? ");
        if (numero1 >= numero2)
            System.out.println("numeroUm é maior ou igual a numeroDois? ");
        if (numero1 < numero2)
            System.out.println("numeroUm é menor a numeroDois? ");
        if (numero1 <= numero2)
            System.out.println("numeroUm é menor ou igual a numeroDois? ");

        String nomeUm = "GABRIEL";
        String nomeDois = new String("GABRIEL");

        System.out.println(nomeUm.equals(nomeDois));

        //lógico
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2)
            System.out.println("as duas condições são verdadeiras");

        if(condicao1 || condicao2)
            System.out.println("uma das condições é verdadeira");

        if(condicao1 && ( 7 > 4 ))
            System.out.println("as duas condições são verdadeiras");
    }
}
