/**
 * <pre>
 * Clase PilaArreglo
 * 
 * Contiene la funcionalidad de una pila 
 * </pre>
 */

package proyecto.calculadora;

/**
 *
 * @author Alejandro Carregha, Emiliano Sandoval
 */

public class PilaArreglo <T> implements PilaADT<T>{ //implementa la interface 
    private T[] datosPila; //Se construye la pila a partir de un arreglo auxiliar
    private int tope;
    private final int MAX = 20;

    public PilaArreglo() {
        datosPila = (T[]) new Object[MAX];
        tope = -1;
    }
    
    /**
     * 
     * @param datos: dato que se desea agregar a la pila 
     */
    
    public void push(T datos){
        if(tope == this.datosPila.length - 1)
            expand();
        tope ++;
        datosPila[tope] = datos;
    }
    
    public T pop(){
        if(tope == -1)
            throw new ColeccionVaciaExcepcion("La pila esta vacia");
        T temp = this.datosPila[tope];
        this.datosPila[tope] = null;
        tope --;
        return temp;
    }
    
    /**
     * 
     * @return <ul>
     *         <li> true: si la pila esta vacia  </li>
     *         <li> false: si la pila no esta vacia </li>
     *         </ul>
     */
    
    public boolean isEmpty(){
        return tope == -1; //evalua si hay datos o no
    }
    
    /**
     * 
     * @return T: regresa el dato que este en el tope de la pila 
     */
    
    public T peek(){
        if(tope == -1)
            throw new ColeccionVaciaExcepcion("La pila esta vacia");
        return this.datosPila[tope];
    }
    
    /**
     * @return String: duplica el tama�o de la pila 
     */
    
    private void expand(){ //Metodo auxiliar para aumentar el tamaño de la pila en caso de que se termine el esapcio del arreglo auxiliar
        T[] masGrande = (T[]) new Object[this.datosPila.length * 2];
        for(int i = 0; i <= tope; i++)
            masGrande[i] = datosPila[i];
        datosPila = masGrande;
    }
    
    /**
     * 
     * @return String: regresa los datos de la pila 
     */
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = tope; i >= 0; i--){
            sb.append(datosPila[i]);
        }
        return sb.toString();
    }   
}
