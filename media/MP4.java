package media;
//@author fsancheztemprano
public class MP4 implements MediaPackage{

    @Override
    public void playFile(String filename) {
        System.out.println("Play MP4: " + filename);
    }

    

}
