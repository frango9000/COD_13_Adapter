package media;
/**
 * Clase MP4 para reproducir video en formato mp4
 * @author fsancheztemprano
 */
public class MP4 implements MediaPackage{

    /**
     * metodo playFile(String filename); de la interfaz MediaPackage que 
     * reproduciria video en formato mp4
     * @param filename 
     */
    @Override
    public void playFile(String filename) {
        System.out.println("Play MP4: " + filename);
    }

    

}
