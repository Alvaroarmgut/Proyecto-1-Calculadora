/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.calculadora;

/**
 *
 * @author carre
 */
public class PilaArreglo <T> implements PilaADT<T>{
    private T[] datosPila;
    private int tope;
    private final int MAX = 20;

    public PilaArreglo() {
        datosPila = (T[]) new Object[MAX];
        tope = -1;
    }
    
    
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
    
    public boolean isEmpty(){
        return tope == -1;
    }
    
    public T peek(){
        if(tope == -1)
            throw new ColeccionVaciaExcepcion("La pila esta vacia");
        return this.datosPila[tope];
    }
    
    private void expand(){
        T[] masGrande = (T[]) new Object[this.datosPila.length * 2];
        for(int i = 0; i <= tope; i++){
            masGrande[i] = datosPila[i];
        }
        datosPila = masGrande;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = tope; i >= 0; i--){
            sb.append(datosPila[i]);
        }
        return sb.toString();
    }
    
    
    
}
