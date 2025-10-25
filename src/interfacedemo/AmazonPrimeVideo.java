package interfacedemo;

public class AmazonPrimeVideo implements MediaPlayer, VideoMediaPlayer{
    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void rewind() {

    }

    @Override
    public void fastForward() {
        System.out.println(" You can seek fast forward 15 seconds");

    }

    @Override
    public void videoSpeed() {
        System.out.println(" video can be played at 2x speed ");


    }

    @Override
    public double resolution() {
        return 0;
    }
}
