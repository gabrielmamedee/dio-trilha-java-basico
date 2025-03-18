public class TiposVariaveis {
    public static void main(String[] args) {
        byte idade = 123;
        short ano = 2021;
        int cep = 58102149;
        long cpf = 98765432109L;
        float pi = 3.14F;
        double salario = 2500.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 1;
        numero = 2;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;
    }
}
