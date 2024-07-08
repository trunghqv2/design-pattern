// Target interface
interface MediaPlayer {
    void play(String audioType, String fileName);
}

// Adaptee classes
class VlcPlayer {
    void playVlc(String fileName) {
        System.out.println("Playing VLC file: " + fileName);
    }
}

class Mp4Player {
    void playMp4(String fileName) {
        System.out.println("Playing MP4 file: " + fileName);
    }
}

// Adapter class
class MediaAdapter implements MediaPlayer {
    private VlcPlayer vlcPlayer;
    private Mp4Player mp4Player;

    MediaAdapter() {
        vlcPlayer = new VlcPlayer();
        mp4Player = new Mp4Player();
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            vlcPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            mp4Player.playMp4(fileName);
        }
    }
}

// Client class
public class AdapterExample {
    public static void main(String[] args) {
        MediaPlayer player = new MediaAdapter();

        player.play("vlc", "movie.vlc");
        player.play("mp4", "video.mp4");
    }
}
