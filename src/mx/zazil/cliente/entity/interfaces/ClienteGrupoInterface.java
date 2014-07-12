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
public interface ClienteGrupoInterface extends Catalogo{
    public String getBuscaContratoMax();
    public String getClienteGrupo();
    public Double getSaldoEje();
    public String getTipoModulo();
    public Double getValorCartera();
    public Double getValorCarteraInstitucion();
}
