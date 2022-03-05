/**
 * <pre>
 * Clase Pilas
 * 
 * Contiene el main de la clase PilaArreglo 
 * </pre>
 */

package proyecto.calculadora;

/**
 *
 * @author Alejandro Carregha, Emiliano Sandoval 
 */

public class Pilas {
    public static void main(String[] args) { //Pruebas del funcionamiento de una pila
        PilaArreglo<String> dias = new PilaArreglo();
        PilaArreglo<Integer> edades = new PilaArreglo();
        PilaArreglo pila = new PilaArreglo();
        
        try {
            System.out.println("\nElemento Quitado: " + dias.pop());
        } catch (Exception e){
            System.out.println("Vacia");
        }
        
        dias.push("Lunes");
        dias.push("Martes");
        dias.push("Miercoles");
        
        System.out.println(dias.peek());
    }
    
}
