/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.zazil.dto;

/**
 *
 * @author Hector Rodriguez
 */
public class TransferenciaDinero extends Transferencia implements Dinero{
    
    /**
     * IVA generado por el movimiento.
     */
    private Double IVA;
    
    /**
     * Importe bruto de la operación.
     */
    private Double importeBruto;
    
    /**
     * Comisión generada por el movimiento.
     */
    private Double comision;

    public Double getIVA() {
        return IVA;
    }

    public void setIVA(Double IVA) {
        this.IVA = IVA;
    }

    public Double getImporteBruto() {
        return importeBruto;
    }

    public void setImporteBruto(Double importeBruto) {
        this.importeBruto = importeBruto;
    }

    public Double getComision() {
        return comision;
    }

    public void setComision(Double comision) {
        this.comision = comision;
    }
}
