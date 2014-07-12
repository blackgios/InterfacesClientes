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
public interface DivisaInterface extends Catalogo{
    public String getClaveDivisa();
    @Override
    public String getDescripcion();
    public String getSimbolo();
    //public estatusVigenciaDetalle getEstatus();
}
