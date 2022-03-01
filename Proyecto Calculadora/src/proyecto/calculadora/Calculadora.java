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
     * Revisa si lo que se tiene en la cadena es un parentesis
     * @return <ul>
     *      <li> true: si la pila esta vacia </li> 
     *      <li> false: si la pila no esta vacia  </li> 
     *      </ul>
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
      * Analiza el sintaxis asegurando de que la expresion no empiece por un operador 
      * @return <ul>
      *         <li> true: si la cadena inicia con parentesis izquierdo </li>
      *         <li> false: si se encuentra cualquier otro operador     </li>
      * </ul>
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
     * Analiza el sintaxis asegurando que no haya operadores juntos
     * @return <ul>
     *         <li> true: si el operador no esta repetido   </li>
     *         <li> false: si el operador esta repetido     </li>
     *         </ul>
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
     * Analiza si la variable es un operador 
     * @param n: una variable x, sea un operante u operador 
     * @return <ul>
     *         <li> true: si n es un operador </li>
     *         <li> false: si n no es un operador </li>
     *         </ul>
     */
    public boolean esOperador(char n){
        boolean resp=false;
        if(n=='*'||n=='/'|| n=='+'||n=='-'){
            resp=true;
        }
        return resp;
    }
    /**
     * Regresa un numero entero, 2 siendo los operadores con mayor jerarquia y 1 los de menor
     * @param n: un operador 
     * @return int: regresa el numero mayor conforme a la jerarquia de operadores
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
     * Metodo para traducir de notacion infija a postfija 
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
     * Regresa el resultado de las operaciones que estaban en la cadena postfija
     * @param postfija: cadena en notacion postfijo
     * @return double: resultado de las operaciones de la cadena postfija 
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
     * Regresa el resultado de la operacion en base a el operador que encuentra 
     * @param cad: operador 
     * @param a: un numero
     * @param b: otro numero 
     * @return double: resultado de la operacion 
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