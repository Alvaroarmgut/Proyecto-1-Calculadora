/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.calculadora;

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
        PilaArreglo<Character>pila=new PilaArreglo();
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
        int dato=0;
        int i=0;
        while(i<cadena.length() && cadena.charAt(i)=='('){
            i++;
        }
        if(cadena.charAt(i)=='*'|| cadena.charAt(i)=='/'||cadena.charAt(i)=='-'||cadena.charAt(i)=='+'){
            resp=false;       
           
        }
      
        return resp;
    }
    public boolean operadoresRepetidos(){
        boolean resp=true;
        PilaArreglo <Character> pilaAux = new PilaArreglo();
        Character elem;
        int i=0;
        while(i<cadena.length()) {
            elem=cadena.charAt(i);
            i++;
            if(elem=='*'||elem=='/'|| elem=='+'||elem=='-'||elem=='.'){
               if(cadena.charAt(i)==elem){
                resp=false; 
               }
        }          
        }	
        
        return resp;
    
  
    }
    public boolean esOperante(char n){
        boolean resp=false;
        if(n=='*'||n=='/'|| n=='+'||n=='-'||n=='('||n==')'){
            resp=true;
        }
        return resp;
    }
    public boolean esOperador(char n){
        boolean resp=false;
        if(n=='*'||n=='/'|| n=='+'||n=='-'){
            resp=true;
        }
        return resp;
    }
    public int estableceJerarquia(char n){
        int resp=0;
        if(n=='+'||n=='-')
            resp=1;
        if(n=='*'||n=='/')
            resp=2;
        return resp;
    }
    
    public String postfijo(){
        PilaArreglo<Character>pila=new PilaArreglo();
        StringBuilder resp=new StringBuilder();
        char simbolo, elemento;
        for(int i=0;i<cadena.length();i++){
            simbolo=cadena.charAt(i);
            if(!esOperante(simbolo)){
                resp.append(simbolo);
            } else{
                if(simbolo=='('){
                    pila.push(simbolo);
                    
                }else{
                   if(esOperador(simbolo)){
                       try{
                           while(estableceJerarquia(simbolo)<=estableceJerarquia(pila.peek())){
                           resp.append(pila.pop());
                           }
                       }catch(Exception e){
                           
                       }
                       
                       pila.push(simbolo);
                   }else{
                       while(pila.peek()!='(')
                           resp.append(pila.pop());
                       pila.pop();
                   }
                }
                
                
            }
                
        }
        while(!pila.isEmpty()){
            resp.append(pila.pop());
        }
        return resp.toString();
    }
    
    
    
}
/*
else{
                while(!pila.pilaVacia() &&
                        pila.Precedencia(pila.peek(), simbolo) ){
                    elemento=pila.quitar();
                    resp.append(elemento);
                }
                if (simbolo != ')') 
                    pila.push(simbolo);  
                else           
                    pila.pop();
            }
        }
        while(!Pila.pilaVacia()){
            elemento = Pila.quitar();
            postfija += elemento;
        }
    }

*/