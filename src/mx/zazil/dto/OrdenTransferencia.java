/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.zazil.dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Hector Rodriguez
 */
public interface OrdenTransferencia extends Serializable{
    public Integer getClaveLiquidacion();
    public Integer getClaveOperacion();
    public Integer getDivisionPromotor();
    public Date getFechaHoraCaptura();
    public Integer getNumeroPromotor();
    public String getUsuarioCapturo();
    public void setClaveLiquidacion(Integer claveLiquidacion);
    public void setClaveOperacion(Integer claveOperacion);
    public void setDivisionPromotor(Integer divisionPromotor);
    public void setFechaHoraCaptura(Date FechaHoraCaptura);
    public void setNumeroPromotor(Integer numeroPromotor);
    public void setUsuarioCapturo(String usuarioCapturo);
    
    public String getClaveSucursal();
    public Date getFechaOperacion();
    public Date getFechaValor();
    public Character getModuloOrden();
    public String getNumeroContrato();
    public Long getNumeroOrden();
    public void setClaveSucursal(String claveSucursal);
    public void setFechaOperacion(Date fechaOperacion);
    public void setFechaValor(Date fechaValor);
    public void setModuloOrden(Character moduloOrden);
    public void setNumeroContrato(String numeroContrato);
    public void setNumeroOrden(Long numeroOrden);
    
    public Double getImporteNeto();
    public void setImporteNeto(Double importeNeto);
    public Double getComision();
    public void setComision(Double comision);
    public Double getIVA();
    public void setIVA(Double iva);
}
