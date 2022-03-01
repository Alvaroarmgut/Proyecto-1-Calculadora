/**
 * <pre>
 * Clase PilaADT
 * 
 * Contiene la interface de una pila 
 * </pre>
 */
package proyecto.calculadora;

/**
 *
 * @author Alejandro Carregha
 */
public interface PilaADT <T>{
    /**
     * 
     * @param datos: dato de tipo general que se quiere agregar a la pila
     */
    public void push(T datos);
    /**
     * 
     * @return T: regresa el dato que se saco de la pila 
     */
    public T pop();
    /**
     * 
     * @return <ul>
     *         <li> true: si la pila esta vacia </li>
     *         <li> false: si la pila no esta vacia </li>
     *         </ul>
     */
    public boolean isEmpty();
    /**
     * 
     * @return T: regresa el dato que esta en el tope de la pila
     */
    public T peek();
}
