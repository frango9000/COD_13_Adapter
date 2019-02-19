package media;
/**
 * adaptador: implementa MediaPlayer para implementar su metodo play(String filename);
 * @author fsancheztemprano
 */
public class FormatAdapter implements MediaPlayer{
    /**
     * Atributo tipo MediaPackage
     */
    private MediaPackage media;

    /**
     * El constructor recibe un parametro MediaPackage para ser adaptado
     * @param media 
     */
    public FormatAdapter(MediaPackage media) {
        this.media = media;
    }
    
    /**
     * implementamos el metodo play(String filename);
     * de MediaPlayer y este hara un llamado al metodo 
     * playFile(String filename); 
     * @param filename 
     */
    @Override
    public void play(String filename) {
        System.out.println("Adaptando --->");
        media.playFile(filename);
    }

}
