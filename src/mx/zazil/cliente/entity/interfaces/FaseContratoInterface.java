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
public interface FaseContratoInterface extends Catalogo{
    public String getClaveFaseContrato();
    @Override
    public String getDescripcion();
    public Date getFechaCaptura();
    public Time getHoraCaptura();
    public String getUsuarioCaptura();
}
