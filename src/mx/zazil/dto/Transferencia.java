/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.zazil.dto;

import java.io.Serializable;

/**
 *
 * @author Hector Rodriguez
 */
public abstract class Transferencia implements Serializable{
    public static Integer HOY = 0;
    public static Integer T24H = 1;
    public static Integer T48H = 2;
    public static Integer T72H = 3;
    public static Integer T96H = 4;
    
    /**
     * Contrato del cliente.
     */
    private String contrato;
    
    /**
     * La orden que genero el movimiento.
     */
    private String numeroDeOrden;
    
    /**
     * Cantidad de la transaccion, si son titulos se redondea.
     */
    private Double cantidad;
    
    /**
     * Numero de dias naturales en los que ocurre el vencimiento.
     */
    private Integer vence;
    
    /**
     * Descripcion del movimiento
     */
    private String descripcion;
    
    /**
     * Si genera un cambio en el saldo disponible
     */
    private Boolean cauciona;
    
    /**
     * Si genera una liquidación, desde T+0 hasta T+4.
     */
    private Boolean liquida;
    
    /**
     * La cuenta del banco donde se va a reflejar la liquidación.
     */
    private String cuentaPropia;
    
    /**
     * Numero del promotor que origino la transaccion.
     */
    private String promotor;
    
    /*************************************************************************************/
    
    
    public String getContrato() {
        return contrato;
    }

    /**
     * El contrato que se afecta.
     * @param contrato 
     */
    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getNumeroDeOrden() {
        return numeroDeOrden;
    }

    /**
     * El número de orden que lo generó.
     * @param numeroDeOrden 
     */
    public void setNumeroDeOrden(String numeroDeOrden) {
        this.numeroDeOrden = numeroDeOrden;
    }

    public Double getCantidad() {
        return cantidad;
    }

    /**
     * El volúmen a transferir.
     * @param cantidad 
     */
    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getVence() {
        return vence;
    }

    /**
     * El número de dias en el que vence, se pueden usar 
     * las costantes HOY, T24H, T48H, T72H, T96H.
     * @param vence 
     */
    public void setVence(Integer vence) {
        this.vence = vence;
    }

    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Descripción del movimiento
     * @param descripcion 
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getCauciona() {
        return cauciona;
    }

    /**
     * Si se va a modificar el saldo disponible inmediatamente.
     * @param cauciona 
     */
    public void setCauciona(Boolean cauciona) {
        this.cauciona = cauciona;
    }

    public Boolean getLiquida() {
        return liquida;
    }

    /**
     * Si se va a modificar el saldo, ya sea hoy o hasta T+3
     * @param liquida 
     */
    public void setLiquida(Boolean liquida) {
        this.liquida = liquida;
    }

    public String getCuentaPropia() {
        return cuentaPropia;
    }

    public void setCuentaPropia(String cuentaPropia) {
        this.cuentaPropia = cuentaPropia;
    }

    public String getPromotor() {
        return promotor;
    }

    public void setPromotor(String promotor) {
        this.promotor = promotor;
    }
    
}
