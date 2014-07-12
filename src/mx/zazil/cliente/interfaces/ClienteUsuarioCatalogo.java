/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.zazil.cliente.interfaces;

import java.util.List;
import mx.zazil.service.Pingeable;

/**
 *
 * @author Hector Rodriguez
 */
public interface ClienteUsuarioCatalogo extends Pingeable{
    List getListaR(String c);
    @Override
    Boolean ping();
}
