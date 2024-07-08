
public class Usuario {
    public static void main(String[] args) {
        System.out.println("ola mundo");

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status-> TV Ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo Status-> TV Ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();  
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        smartTv.mudarCanal(12);
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Canal Atual: " + smartTv.canal);


    }

}
