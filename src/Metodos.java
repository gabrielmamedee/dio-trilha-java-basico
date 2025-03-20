public class Metodos {

    public double somar(int num1, int num2) {
        //LOGICA - FINALIDADE DO METODO
        int soma = num1 + num2;
        return soma;
    }

    public void imprimir(String texto) {
        //LOGICA - FINALIDADE DO METODO
        //AQUI NÃO PRECISA DE RETURN
        //POIS NÃO RERÁ RETORNADO NENHUM RESULTADO
    }

    //throws Exception : indica que o metodo ao ser utilizado poderá gerar uma exceção
    //public double dividir(int dividendo, int divisor) throws Exception{}

    //este metodo não pode ser visto por outras classes no
    private void metodoPrivado(){}

    //alguns equívocos estruturais

    public void  validar(){
        //este metodo deveria retornar algum valor
        //no caso boolena (true ou false)
        //com isso, esse metodo nao pode ser void
    }

    public void calcularEnviar() {
        //um metodo deve representar uma unica reponsabilidade
    }

    public void gravarCliente(String nome, String cpf){
        //esta metodo tem a finalidade de gravar informacoes de um cliente.
        //por que nao criar um objeto cliente e passar como parametro?
        //veja abaixo
    }

    //public void gravarCliente(Cliente cliente){}
    //ou
    //public void gravar(Cliente cliente){}
}
