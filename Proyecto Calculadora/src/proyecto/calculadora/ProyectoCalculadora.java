/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.calculadora;

/**
 *
 * @author carre
 */
public class ProyectoCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora c1 = new Calculadora("(((1+2)*2)/2)-1");
        System.out.println(c1.revParentesis());
        System.out.println(c1.iniciaMal());
        System.out.println(c1.operadoresRepetidos());
        System.out.println(c1.postfijo());
        System.out.println(c1.resuelve(c1.postfijo()));
    }
    
}
