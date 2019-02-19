package media;
//@author fsancheztemprano
public class Main {
    public static void main(String[] args) {
    MediaPlayer player = new MP3();
    player.play("audio.pm3");
    player = new FormatAdapter(new VLC());
    player.play("video.vlc");
    player = new FormatAdapter(new MP4());
    player.play("video.mp4");
        
    }

}
