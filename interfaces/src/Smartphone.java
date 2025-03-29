public class Smartphone implements VideoPlayer, MusicPlayer{
    @Override
    public void playMusic() {
        System.out.println("O smarthphone está reproduzindo a música");

    }

    @Override
    public void pauseMusic() {
        System.out.println("O smarthphone está pausando a música");

    }

    @Override
    public void stopMusic() {
        System.out.println("O smarthphone está parando a música");

    }

    @Override
    public void playVideo() {
        System.out.println("O smarthphone está reproduzindo o vídeo");

    }

    @Override
    public void pauseVideo() {
        System.out.println("O smarthphone está pausando o vídeo");
    }

    @Override
    public void stopVideo() {
        System.out.println("O smarthphone está parando o vídeo");

    }
}
