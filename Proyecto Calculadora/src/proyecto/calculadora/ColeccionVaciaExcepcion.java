/**
 * <pre>
 * Clase ColeccionVaciaExcepcion
 * 
 * Contiene la expcecion 
 * </pre>
 */

package proyecto.calculadora;

/**
 *
 * @author Alejandro Carregha
 */

public class ColeccionVaciaExcepcion extends RuntimeException {
    
    public ColeccionVaciaExcepcion() {
        super();
    }
    
    /**
     * 
     * @param mensaje: mensaje que se quiere dar al lanzar la excepcion 
     */
    
    public ColeccionVaciaExcepcion(String mensaje) {
        super(mensaje);
    }
    
}
