/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.calculadora;

import pilas.PilaA;

/**
 *
 * @author carre
 */
public class Calculadora {
    private String cadena;
    
    
    public Calculadora(String unaExpresion){
        cadena=unaExpresion;
    }
     public boolean revParentesis(){
        boolean resp;
        PilaA<Character>pila=new PilaA();
        for(int i=0;i<cadena.length();i++){
            if(cadena.charAt(i)=='('){
                pila.push('(');
    
            }else{
                if(cadena.charAt(i)==')'){
                    pila.pop();
                }
                
            }
        }
        if(pila.isEmpty()){
            resp=true;
        }else{
            resp=false;
        }
        return resp;
    }
    public boolean iniciaMal(){
        boolean resp=true;
        int i=0;
        int dato=0;
        while(cadena.charAt(i)=='('||i<cadena.length()){
            dato=cadena.charAt(i);
            i++;
        }
        if(cadena.charAt(dato)=='*'|| cadena.charAt(dato)=='/'||cadena.charAt(dato)=='-'||cadena.charAt(dato)=='+'){
            resp=false;       
           
        }
      
        return resp;
    }
    
    
}
