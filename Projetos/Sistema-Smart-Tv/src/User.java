public class User {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.turnOn();
        System.out.println("Novo Estado -> TV Ligada? " + smartTv.on);

        smartTv.changeChannel(645);
        System.out.println("Canal Atual é: " + smartTv.channel);

        smartTv.increaseVolume();
        smartTv.increaseVolume();
        smartTv.increaseVolume();
        System.out.println("Volume aumentado para: " + smartTv.volume);

        smartTv.increaseChannel();
        smartTv.increaseChannel();
        smartTv.increaseChannel();
        smartTv.increaseChannel();
        smartTv.increaseChannel();
        smartTv.increaseChannel();
        smartTv.increaseChannel();
    
        System.out.println("Canal aumentado para: " + smartTv.channel);

        smartTv.decreaseVolume();
        smartTv.decreaseVolume();
        smartTv.decreaseVolume();
        smartTv.decreaseVolume();
        smartTv.decreaseVolume();
        System.out.println("Volume diminuido para: " + smartTv.volume);

        smartTv.decreaseChannel();
        smartTv.decreaseChannel();
        smartTv.decreaseChannel();
        smartTv.decreaseChannel();
        System.out.println("Canal diminuido para: " + smartTv.channel);

        smartTv.turnOff();
        System.out.println("Novo Estado -> TV Desligada? " + smartTv.on);

    }
}
