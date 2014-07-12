/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.zazil.cliente.entity.interfaces;

import java.sql.Time;
import java.util.Date;
import mx.zazil.entity.Catalogo;

/**
 *
 * @author Hector Rodriguez
 */
public interface PerfilClienteInterface extends Catalogo{
    public Integer getClavePerfilCliente();
    @Override
    public String getDescripcion();
    public Date getFechaCaptura();
    public Time getHoraCaptura();
    public Double getRangoMaximo();
    public Double getRangoMinimo();
    public String getUsuarioCapturo();
}
