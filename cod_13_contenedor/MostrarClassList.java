package cod_13_contenedor;


/**
 * @author fsancheztemprano
 */
public class MostrarClassList {
    public static void mostrar(InterfaceList lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + " " + lista.getElement(i));
        }
    }

}
