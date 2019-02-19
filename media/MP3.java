package media;
/**
 * Clase MP3 para reproducir audio en mp3
 * @author fsancheztemprano
 */
public class MP3 implements MediaPlayer{
/**
 * metodo play(String filename); de la interfaz MediaPlayer que 
 * reproduciria audio en mp3
 * @param filename el nombre del  archivo
 */
    @Override
    public void play(String filename) {
        System.out.println("Play MP3: " + filename);
    }

}
