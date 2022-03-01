/**
 * <pre>
 * Clase ProyectoCalculadora
 * 
 * Contiene el main del proyecto
 * </pre>
 */
package proyecto.calculadora;

/**
 *
 * @author Alvaro Armella, Alvaro Lopez, Jimena Rodriguez, Alejandro Carregha, Emiliano Sandoval
 */
public class ProyectoCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora c1 = new Calculadora("(((1+2)*2)/2)-1");
        System.out.println(c1.revParentesis());
        System.out.println(c1.iniciaMal());
        System.out.println(c1.operadoresRepetidos());
        System.out.println(c1.postfijo());
        System.out.println(c1.resuelve(c1.postfijo()));
    }
    
}
