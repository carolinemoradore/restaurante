/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOComandaCliente;
import java.util.ArrayList;
import model.ModelComandaCliente;

/**
 *
 * @author CaroleCristhian
 */
public class ControllerComandaCliente {
    
    private DAOComandaCliente daoComandaCliente = new DAOComandaCliente();
    
    public ArrayList<ModelComandaCliente> getListaComandaClienteController(){
        return this.daoComandaCliente.getListaComandaClienteDAO();
    }
}
