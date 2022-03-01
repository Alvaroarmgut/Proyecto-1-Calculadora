/**
 * <pre>
 * Clase VistaCalculadora
 * 
 * Contiene la funcionalidad de la calculadora 
 * </pre>
 */
package proyecto.calculadora;

/**
 *
 * @author  Alvaro Armella, Alvaro Lopez, Jimena Rodriguez, Alejandro Carregha, Emiliano Sandoval
 */
public class Calculadora {
    private String cadena;
    
    /**
     * 
     * @param unaExpresion: representa una expresión String 
     */
    public Calculadora(String unaExpresion){
        cadena=unaExpresion;
    }
    /**
     * 
     * @return String: analiza si la cadena contiene un parentesis
     */
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
     /**
      * 
      * @return String: Analiza el sintaxis asegurando de que la expresion no empiece por un operador 
      */
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
    /**
     * 
     * @return String: Analiza el sintaxis asegurando que no haya operadores juntos
     */
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
    /**
     * 
     * @param n: una variable x, sea un operante u operador
     * @return String: regresa si la variable es un operante 
     */
    public boolean esOperante(char n){
        boolean resp=false;
        if(n=='*'||n=='/'|| n=='+'||n=='-'||n=='('||n==')'){
            resp=true;
        }
        return resp;
    }
    /**
     * 
     * @param n: una variable x, sea un operante u operador 
     * @return String: Analiza si la variable es un operador 
     */
    public boolean esOperador(char n){
        boolean resp=false;
        if(n=='*'||n=='/'|| n=='+'||n=='-'){
            resp=true;
        }
        return resp;
    }
    /**
     * 
     * @param n: un operador 
     * @return String: regresa un numero entero, 2 siendo los operadores con mayor jerarquia y 1 los de menor
     */
    public int estableceJerarquia(char n){
        int resp=0;
        if(n=='+'||n=='-')
            resp=1;
        if(n=='*'||n=='/')
            resp=2;
        return resp;
    }
    /**
     * 
     * @return String: regresa la cadena representada en notación postfijo 
     */
    public String postfijo(){
        PilaArreglo<Character>pila=new PilaArreglo();
        StringBuilder resp=new StringBuilder();
        char simbolo, elemento;
        for(int i=0;i<cadena.length();i++){
            simbolo=cadena.charAt(i);
            if(!esOperante(simbolo)){
                resp.append(simbolo);
            } else{
                if(simbolo!='('){
                resp.append(" ");
                }
                if(simbolo=='('){
                    pila.push(simbolo);
                }else{
                   if(esOperador(simbolo)){
                       try{
                           while(estableceJerarquia(simbolo)<=estableceJerarquia(pila.peek())){
                        	   //resp.append('[');
                               resp.append(pila.pop());
                           }
                       }catch(Exception e){
                           
                       }

                       pila.push(simbolo);

                   }else{
                       while(pila.peek()!='('){
                       resp.append(pila.pop());
                       }
                       pila.pop();

                   }
                }
                
                
            }
                
        }
        while(!pila.isEmpty()){
            resp.append(" ");
            resp.append(pila.pop());

        }
        return resp.toString() + " ";
    }
    /**
     * 
     * @param postfija: cadena en notacion postfijo
     * @return String: regresa el resultado de las operaciones que estaban en la cadena postfija
     */
    public double resuelve(String postfija){
        double resp;
        char valor;
        double op1, op2;
        PilaArreglo <Double>pila=new PilaArreglo();
        StringBuilder elemento=new StringBuilder();
        for(int i=0;i<postfija.length();i++){
            valor=postfija.charAt(i);
            if(valor != ' '){
                elemento.append(valor);
            } else{
                if(!esOperador(elemento.toString().charAt(0))){
                    pila.push(Double.parseDouble(elemento.toString()));
                    elemento.setLength(0);
                } else{
                    op2 = pila.pop();
                    op1 = pila.pop();
                    pila.push(evaluar(elemento.toString().charAt(0), op1, op2));
                    elemento.setLength(0);
                }
            }
          
        }
        
    resp=pila.pop();
    return resp;
    }
    /**
     * 
     * @param cad: operador 
     * @param a: un numero
     * @param b: otro numero 
     * @return String: Regresa el resultado de la operacion en base a el operador que encuentra 
     */
    public double evaluar (char cad, double a, double b ){
        double resp;
        if(cad=='-'){
            resp=a-b;
        }else{
            if(cad=='+'){
                resp=a+b;
            }else{
                if(cad=='*'){
                    resp=a*b;
                }else{
                    resp=a/b;
                }
                

            }
        }
        return resp;
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