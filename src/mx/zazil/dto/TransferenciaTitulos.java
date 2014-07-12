/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.zazil.dto;

/**
 *
 * @author Hector Rodriguez
 */
public class TransferenciaTitulos extends Transferencia implements Titulos{
    
    private String tipoValor;
    private String emisora;
    private String serie;
    private Integer claveTipoPortafolio;

    @Override
    public String getTipoValor() {
        return tipoValor;
    }

    @Override
    public String getEmisora() {
        return emisora;
    }

    @Override
    public String getSerie() {
        return serie;
    }

    public void setTipoValor(String tipoValor) {
        this.tipoValor = tipoValor;
    }

    public void setEmisora(String emisora) {
        this.emisora = emisora;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Integer getClaveTipoPortafolio() {
        return claveTipoPortafolio;
    }

    public void setClaveTipoPortafolio(Integer claveTipoPortafolio) {
        this.claveTipoPortafolio = claveTipoPortafolio;
    }
    
    
    
}
