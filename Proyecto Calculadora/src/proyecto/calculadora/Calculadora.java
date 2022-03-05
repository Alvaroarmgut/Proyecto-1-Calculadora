/**
 * <pre>
 * Clase Calculadora
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
     * @param unaExpresion: representa una expresion String 
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
        PilaArreglo <Character> pila = new PilaArreglo(); //pila auxiliar
        
        for(int i=0;i<cadena.length();i++)
            if(cadena.charAt(i)=='(')
                pila.push('(');
            else
                if(cadena.charAt(i)==')')
                    pila.pop();  
        if(pila.isEmpty())
            resp=true;
        else
            resp=false;
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
        
        while(i<cadena.length() && cadena.charAt(i)=='(')
            i++;
        if(cadena.charAt(i)=='*'|| cadena.charAt(i)=='/'||cadena.charAt(i)=='-'||cadena.charAt(i)=='+') //revisa si inicia con un operador
            resp=false;      
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
            if(elem=='*'||elem=='/'|| elem=='+'||elem=='-'||elem=='.')
               if(cadena.charAt(i)==elem)
                   resp=false; 
        }            
        return resp;
    }
    
    /**
     * 
     * @param n: una variable x, sea un operante u operador
     * @return String: regresa si la variable es un operante 
     */
    
    private boolean esOperante(char n){ //pregunta si el caracter es un símbolo
        boolean resp=false;
        if(n=='*'||n=='/'|| n=='+'||n=='-'||n=='('||n==')') 
            resp=true;
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
    
    private boolean esOperador(char n){ //pregunta si el caracter es un operador
        boolean resp=false;
        if(n=='*'||n=='/'|| n=='+'||n=='-')
            resp=true;
        return resp;
    }
    
    /**
     * Regresa un numero entero, 2 siendo los operadores con mayor jerarquia y 1 los de menor
     * @param n: un operador 
     * @return int: regresa el numero mayor conforme a la jerarquia de operadores
     */
    
    private int estableceJerarquia(char n){
        int resp=0;
        if(n=='+'||n=='-')
            resp=1;
        if(n=='*'||n=='/')
            resp=2;
        return resp;
    }
    
    /**
     * Metodo para traducir de notacion infija a postfija 
     * @see: esOperante, esOperador, estableceJerarquia 
     * @return String: regresa la cadena representada en notación postfijo 
     */
    
    public String postfijo(){ 
        PilaArreglo<Character>pila=new PilaArreglo();
        StringBuilder resp=new StringBuilder();
        char simbolo, elemento;
        
        for(int i=0;i<cadena.length();i++){
            simbolo=cadena.charAt(i); //guarda cada elemento de la cadena dada
            if(!esOperante(simbolo)){ //pregunta si no es un símbolo
                resp.append(simbolo);
            }else{
                if(simbolo!='('){
                    resp.append(" "); //Si el simbolo no es un parentesis izquierdo se agrega un espacio para separar numeros y operadores
                }
                if(simbolo=='('){
                    pila.push(simbolo);
                }else{
                   if(esOperador(simbolo)){
                       try{
                           while(estableceJerarquia(simbolo)<=estableceJerarquia(pila.peek())){ //se toma en cuenta la jerarquia de los operadores para sacar de la pila 
                               resp.append(pila.pop());
                           }
                       }catch(Exception e){ //en caso de que se marque error
                           
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
        return resp.toString() + " "; //se regresa la expresion en postfija en forma de cadena
    }
    
    /**
     * Regresa el resultado de las operaciones que estaban en la cadena postfija
     * @param postfija: cadena en notacion postfijo
     * @see esOperador
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
                    pila.push(Double.parseDouble(elemento.toString())); //se convierte el dato a Double
                    elemento.setLength(0); //se reinicia la variable para poder guardar el siguiente elemento de la cadena 
                } else{
                    op2 = pila.pop();
                    op1 = pila.pop();
                    pila.push(evaluar(elemento.toString().charAt(0), op1, op2)); //se hace uso del metodo auxiliar para la solucion de la operacion 
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
    
    private double evaluar (char cad, double a, double b ){ //dependiendo del operdador dado, se realiza la operacion correspondeinte
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