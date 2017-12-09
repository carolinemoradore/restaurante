package controller;

import model.ModelComanda;
import DAO.DAOComanda;
import java.util.ArrayList;

/**
*
* @author AnaCaroline
*/
public class ControllerComanda {

    private DAOComanda daoComanda = new DAOComanda();

    /**
    * grava Comanda
    * @param pModelComanda
    * return int
    */
    public int salvarComandaController(ModelComanda pModelComanda){
        return this.daoComanda.salvarComandaDAO(pModelComanda);
    }

    /**
    * recupera Comanda
    * @param pId_comanda
    * return ModelComanda
    */
    public ModelComanda getComandaController(int pId_comanda){
        return this.daoComanda.getComandaDAO(pId_comanda);
    }

    /**
    * recupera uma lista deComanda
    * @param pId_comanda
    * return ArrayList
    */
    public ArrayList<ModelComanda> getListaComandaController(){
        return this.daoComanda.getListaComandaDAO();
    }

    /**
    * atualiza Comanda
    * @param pModelComanda
    * return boolean
    */
    public boolean atualizarComandaController(ModelComanda pModelComanda){
        return this.daoComanda.atualizarComandaDAO(pModelComanda);
    }

    /**
    * exclui Comanda
    * @param pId_comanda
    * return boolean
    */
    public boolean excluirComandaController(int pId_comanda){
        return this.daoComanda.excluirComandaDAO(pId_comanda);
    }
}