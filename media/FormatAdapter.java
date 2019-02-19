package media;
//@author fsancheztemprano
public class FormatAdapter implements MediaPlayer{
    private MediaPackage media;

    public FormatAdapter(MediaPackage media) {
        this.media = media;
    }
    
    

    @Override
    public void play(String filename) {
        System.out.println("Adaptando --->");
        media.playFile(filename);
    }

}
