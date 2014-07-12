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
public interface BancoInterface extends Catalogo{
    
    public Integer getClaveBanco();
    
    public Integer getClaveMonedaSecoban();
    
    public String getClaveSecoban();
    
    public Date getFechaFactura();
    
    public Time getHoraCaptura();
    
    public String getRFC();
    
    public String getRazonSocial();
    
}
