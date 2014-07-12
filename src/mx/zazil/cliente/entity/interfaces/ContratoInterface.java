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
public interface ContratoInterface extends Catalogo{
    public void insertarCatalogo(Catalogo catalogoClientes);
    public Integer getID();
    public Boolean isAdmonPort();
    public Boolean isAsesoriaFin();
    public Boolean isCapCheque();
    public Boolean isCapRecibo();
    public Boolean isCaucion();
    public Boolean isChequeIndeval();
    public Boolean isClienteCorporativo();
    public Boolean isCobroUsoBanco();
    public Boolean isConfidencial();
    public Boolean isCuentaConInstitucion();
    public Boolean isCuentaInstitucional();
    public Boolean isContratoDistorsion();
    public Boolean isContratoGrupo();
    public Boolean isCusExt();
    public Boolean isDoctoExcepcion();
    public Boolean isDocumentado();
    public Boolean isEmisionExt();
    public Boolean isGenerador();
    public Boolean isInternacional();
    public Boolean isISR();
    public Boolean isIVA();
    public Boolean isManejoCuenta();
    public Boolean isOperacionAvalPre();
    public Boolean isSaldoDeudor();
    public Boolean isSaldoDeudorEfe();
    public Boolean isVendeSinPos();
    public Boolean isWarrants();
}
