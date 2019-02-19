package media;
//@author fsancheztemprano
public class MP3 implements MediaPlayer{

    @Override
    public void play(String filename) {
        System.out.println("Play MP3: " + filename);
    }

}
