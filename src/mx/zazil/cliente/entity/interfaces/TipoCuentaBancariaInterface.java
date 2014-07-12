/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.zazil.cliente.entity.interfaces;

import java.util.Date;
import mx.zazil.entity.Catalogo;

/**
 *
 * @author Hector Rodriguez
 */
public interface TipoCuentaBancariaInterface extends Catalogo{
    @Override
    public String getDescripcion();
    public Date getFechaCaptura();
    public Integer getTipoCuentaBancaria();
    public String getUsuarioCapturo();
}
