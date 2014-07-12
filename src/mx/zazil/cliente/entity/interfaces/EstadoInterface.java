/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.zazil.cliente.entity.interfaces;

import mx.zazil.entity.Catalogo;

/**
 *
 * @author Hector Rodriguez
 */
public interface EstadoInterface extends Catalogo{
    public Integer getID();
    public String getClaveEstado();
    public String getDescripcion();
}
