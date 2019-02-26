package lista;

import java.util.HashMap;

/**
 * @author fsancheztemprano
 */
public class ClassHash implements InterfaceHash {
    private HashMap<Integer, String> hash;
    private static int id = 10;

    public ClassHash() {
        this.hash = new HashMap<>();
    }
    
    public HashMap<Integer, String> getHash() {
        return hash;
    }

    

    @Override
    public String toString() {
        return "ClassHash{" + "hash=" + hash + '}';
    }

    @Override
    public void putValue(String elemento) {
        hash.put(id, elemento);
        id++;
    }

    @Override
    public String pushValue(int key) {
        return hash.get(key);
    }

}
