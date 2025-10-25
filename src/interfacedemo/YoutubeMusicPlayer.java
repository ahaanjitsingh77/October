package interfacedemo;

public class YoutubeMusicPlayer implements AudioMediaPlayer {
    @Override
    public void play() {
        System.out.println(" you can play music on the player ");

    }

    @Override
    public void pause() {
        System.out.println(" you can pause the music player");

    }

    @Override
    public void stop() {
        System.out.println(" you can stop the music player ");

    }

    @Override
    public void rewind() {
        System.out.println(" you can rewind 10 seconds ");

    }

    @Override
    public void fastForward() {
        System.out.println(" you can fastForward 10 seconds ");

    }
}
