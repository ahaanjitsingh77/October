package interfacedemo;

public class MainMediaPlayer {
    public static void main(String[] args) {
        // netflix
        System.out.println("Welcome to My Streaming Services");
        System.out.println("If you want to download, please select the service with payment option");

//        Netflix netflix = new Netflix();
//        System.out.println("Here are the features available for netflix");
//        netflix.play();
//        netflix.pause();
//        netflix.videoSpeed();
//        netflix.downloadFeature();
//        netflix.liveStreaming();
//        netflix.resolution();
//        netflix.streamable();


        // Youtube Music

        YoutubeMusicPlayer youtubeMusicPlayer = new YoutubeMusicPlayer();
        System.out.println(" Welcome to the youtubeMusicPlayer ");
        System.out.println(" The following feature are of youtubeMusicPlayer");
        youtubeMusicPlayer.play();
        youtubeMusicPlayer.stop();
        youtubeMusicPlayer.pause();
        youtubeMusicPlayer.fastForward();
        youtubeMusicPlayer.rewind();


        // Amazon Prime Video
        System.out.println(" Welcome to the AmazonPrimeVideo");
        AmazonPrimeVideo amazonPrimeVideo = new AmazonPrimeVideo();
        amazonPrimeVideo.fastForward();
        amazonPrimeVideo.videoSpeed();



        // Hotstar
        System.out.println(" Welcome to the Hotstar ");
        Hotstar hotstar = new Hotstar();
        hotstar.downloadFeature();
        hotstar.resolution();
        hotstar.videoSpeed();



        // Spotify


        // Audible 

    }
}
