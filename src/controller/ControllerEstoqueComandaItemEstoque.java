/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import DAO.DAOEstoqueComandaItemEstoque;
import java.util.ArrayList;
import model.ModelEstoqueComandaItemEstoque;
/**
 *
 * @author PC
 */
public class ControllerEstoqueComandaItemEstoque {
    private DAOEstoqueComandaItemEstoque daoEstoqueComandaItemEstoque = new DAOEstoqueComandaItemEstoque();
    public ArrayList<ModelEstoqueComandaItemEstoque> getListaEstoqueComandaItemController(int pCodigoVenda){
        return this.daoEstoqueComandaItemEstoque.getListaEstoqueComandaItemDAO(pCodigoVenda);
                
    }
}
