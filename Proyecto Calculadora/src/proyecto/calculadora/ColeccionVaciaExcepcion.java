/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.calculadora;

/**
 *
 * @author carre
 */
public class ColeccionVaciaExcepcion extends RuntimeException {

    public ColeccionVaciaExcepcion() {
        super();
    }
    
    public ColeccionVaciaExcepcion(String mensaje) {
        super(mensaje);
    }
    
}
