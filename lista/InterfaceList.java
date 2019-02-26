package lista;
//@author fsancheztemprano

import java.util.ArrayList;
import java.util.Iterator;

public interface InterfaceList {
    public ArrayList<String> list= new ArrayList<>();
    
    public void putElement(String element);
    
    public String getElement(int index);
    
    public Iterator iterator();
    
    public int size();

}