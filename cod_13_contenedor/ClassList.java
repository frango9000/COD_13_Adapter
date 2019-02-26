package cod_13_contenedor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author fsancheztemprano
 */
public class ClassList implements InterfaceList{
    ArrayList<String> list;

    public ClassList() {
        this.list = new ArrayList<>();
    }
    
    /**
     * @return the list
     */
    public ArrayList<String> getList() {
        return list;
    }
    
    @Override
    public void putElement(String element) {
        getList().add(element);
    }

    @Override
    public String getElement(int index) {
        return getList().get(index);
    }

    @Override
    public Iterator iterator(){
        return list.iterator();
    }

    @Override
    public int size() {
        return list.size();
    }

}
