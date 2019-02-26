package cod_13_contenedor;
/**
 * @author fsancheztemprano
 */
public class COD_13_Adapter {
    public static void main(String[] args) {
        ClassHash hash = new ClassHash();
        hash.putValue("valor 1");
        hash.putValue("valor 2");
        
        MostrarClassList.mostrar( new Hash2List(hash) );
        
        
        
        ClassList list = new ClassList();
        list.putElement("elemento 1");
        list.putElement("elemento 2");
        
        MostrarClassList.mostrar(list);
        



    }
}