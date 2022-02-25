/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.calculadora;

/**
 *
 * @author carre
 */
public class Pilas {
    public static void main(String[] args) {
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
