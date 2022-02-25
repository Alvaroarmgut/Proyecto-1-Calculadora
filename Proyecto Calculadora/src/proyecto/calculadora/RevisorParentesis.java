/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.calculadora;

/**
 *
 * @author carre
 */
public class RevisorParentesis{
    char[] aRevisar;

    public RevisorParentesis(char[] aRevisar) {
        this.aRevisar = aRevisar;
    }
    
    public boolean revisar(){
        boolean resp = true;
        PilaArreglo pila = new PilaArreglo();
        int i = 0;
        while(i < aRevisar.length && resp){
            if(aRevisar[i] == '('){
                pila.push(aRevisar[i]);
            } else if(aRevisar[i] == ')'){
                try{
                    pila.pop();
                } catch(Exception e){
                    resp = false;
                }
                    
            } else{
                resp = false;
            }
            i++;
        }
        if(!pila.isEmpty())
            resp = false;
        return resp;
    }
    
}
