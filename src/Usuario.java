public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("TV Ligada? " + smartTv.ligada);

        smartTv.mudarCanal(12);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual:  " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> Tv Ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo status -> Tv Ligada? " + smartTv.ligada);
    }
}
