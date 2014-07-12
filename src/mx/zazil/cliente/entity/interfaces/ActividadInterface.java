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
public interface ActividadInterface extends Catalogo{
    /**
     * <li>Obtiene: Clave Actividad </li>
     * <li>Tabla De referencia: Actividad </li>
     * @param Sin Parametros
     * @return Campo en la Tabla: Actividad.CveActividad
     */
    public Integer getCveActividad();
    
    /**
     * <li>Obtiene: Fecha Captura Actividad </li>
     * <li>Tabla De referencia: Actividad </li>
     * @param Sin Parametros
     * @return Campo en la Tabla: Actividad.FecCaptura
     */
    public Date getFechaCaptura();
    
    /**
     * <li>Obtiene: Hora Captura Actividad </li>
     * <li>Tabla De referencia: Actividad </li>
     * @param Sin Parametros
     * @return Campo en la Tabla: Actividad.HoraCaptura
     */
    public Time getHoraCaptura();
    
    /**
     * <li>Obtiene: Usuario Capturo Actividad </li>
     * <li>Tabla De referencia: Actividad </li>
     * @param Sin Parametros
     * @return Campo en la Tabla: Actividad.UsuarioCapturo
     */
    public String getUsuarioCapturo();
}
