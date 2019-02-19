package media;
/**
 * Clase VLC para reproducir video en formato vlc
 * @author fsancheztemprano
 */
public class VLC implements MediaPackage{
/**
 * metodo playFile(String filename); de la interfaz MediaPackage que 
 * reproduciria video en formato vlc
 * @param filename el nombre del  archivo
 */

    @Override
    public void playFile(String filename) {
        System.out.println("Play VLC: " + filename);
    }

}
