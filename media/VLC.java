package media;
//@author fsancheztemprano
public class VLC implements MediaPackage{

    @Override
    public void playFile(String filename) {
        System.out.println("Play VLC: " + filename);
    }

}
