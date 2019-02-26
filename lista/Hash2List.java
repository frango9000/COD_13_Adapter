package lista;

import java.util.Iterator;

/**
 * @author fsancheztemprano
 */
public class Hash2List implements InterfaceList {
    private ClassHash ch;
    private ClassList list = new ClassList();

    public Hash2List() {
    }

    public Hash2List(ClassHash ch) {
        this.ch = ch;
        Iterator<Integer> it = ch.getHash().keySet().iterator();
        while(it.hasNext()){
            list.putElement(ch.getHash().get(it.next()));
        }  
    }
    

    @Override
    public void putElement(String element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getElement(int index) {
        return list.getElement(index);
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        return list.size();
    }
    

}
