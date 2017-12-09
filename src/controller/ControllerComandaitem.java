package controller;

import model.ModelComandaitem;
import DAO.DAOComandaitem;
import java.util.ArrayList;

/**
*
* @author AnaCaroline
*/
public class ControllerComandaitem {

    private DAOComandaitem daoComandaitem = new DAOComandaitem();

    /**
    * grava Comandaitem
    * @param pModelComandaitem
    * return int
    */
    public int salvarComandaitemController(ModelComandaitem pModelComandaitem){
        return this.daoComandaitem.salvarComandaitemDAO(pModelComandaitem);
    }

    /**
    * recupera Comandaitem
    * @param pId_comandaitem
    * return ModelComandaitem
    */
    public ModelComandaitem getComandaitemController(int pId_comandaitem){
        return this.daoComandaitem.getComandaitemDAO(pId_comandaitem);
    }

    /**
    * recupera uma lista deComandaitem
    * @param pId_comandaitem
    * return ArrayList
    */
    public ArrayList<ModelComandaitem> getListaComandaitemController(){
        return this.daoComandaitem.getListaComandaitemDAO();
    }

    /**
    * atualiza Comandaitem
    * @param pModelComandaitem
    * return boolean
    */
    public boolean atualizarComandaitemController(ModelComandaitem pModelComandaitem){
        return this.daoComandaitem.atualizarComandaitemDAO(pModelComandaitem);
    }

    /**
    * exclui Comandaitem
    * @param pId_comandaitem
    * return boolean
    */
    public boolean excluirComandaitemController(int pId_comandaitem){
        return this.daoComandaitem.excluirComandaitemDAO(pId_comandaitem);
    }

    public boolean salvarComandaitemController(ArrayList<ModelComandaitem> plistaModelComandaitem) {
        return this.daoComandaitem.salvarComandaitemDAO(plistaModelComandaitem);
    }
}