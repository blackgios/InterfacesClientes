/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.zazil.excepcion;

/**
 *
 * @author Hector Rodriguez
 */
public class OperacionInvalidaExcepcion extends Exception{

    public OperacionInvalidaExcepcion() {
    }

    public OperacionInvalidaExcepcion(String message) {
        super(message);
    }
}
