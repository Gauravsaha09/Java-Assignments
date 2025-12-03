abstract class MediaPlayer {
    abstract void play(); 
    abstract void pause();
    abstract void stop();
}

class AudioPlayer extends MediaPlayer{
    void play(){
        System.out.println("Playing Audio...");
    }

    void pause(){
        System.out.println("Audio Pause..");
    }
    void stop(){
        System.out.println("Audio Stop..");
    }
}

class VideoPlayer extends MediaPlayer{
void play(){
        System.out.println("Playing Video...");
    }

void pause(){
        System.out.println("Video Pause..");
    }
void stop(){
        System.out.println("Video Stop..");
    }
}

public class Q2{
    public static void main(String[] args) {
        AudioPlayer audio = new AudioPlayer();
        VideoPlayer video = new VideoPlayer();

        System.out.println("...Audio play...");
        audio.play();
        audio.pause();
        audio.stop();
        System.out.println("...video play...");
        video.play();
        video.pause();
        video.stop();        
    }
}