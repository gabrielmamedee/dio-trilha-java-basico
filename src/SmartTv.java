public class SmartTv {
    boolean ligada = false;
    int canal = 7;
    int volume = 12;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Aulmentando Canal: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuindo canal: " + canal);
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

}
