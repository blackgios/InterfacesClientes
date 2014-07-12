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
public interface ClienteTesoreriaCatalogo extends Pingeable{
    List getListaClientes(Class c);
}
