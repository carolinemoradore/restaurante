package controller;

import model.ModelEstoque;
import DAO.DAOEstoque;
import java.util.ArrayList;

/**
*
* @author AnaCaroline
*/
public class ControllerEstoque {

    private DAOEstoque daoEstoque = new DAOEstoque();

    /**
    * grava Estoque
    * @param pModelEstoque
    * return int
    */
    public int salvarEstoqueController(ModelEstoque pModelEstoque){
        return this.daoEstoque.salvarEstoqueDAO(pModelEstoque);
    }

    /**
    * recupera Estoque
    * @param pId_estoque
    * return ModelEstoque
    */
    public ModelEstoque getEstoqueController(int pId_estoque){
        return this.daoEstoque.getEstoqueDAO(pId_estoque);
    }

    /**
    * recupera uma lista deEstoque
    * @param pId_estoque
    * return ArrayList
    */
    public ArrayList<ModelEstoque> getListaEstoqueController(){
        return this.daoEstoque.getListaEstoqueDAO();
    }

    /**
    * atualiza Estoque
    * @param pModelEstoque
    * return boolean
    */
    public boolean atualizarEstoqueController(ModelEstoque pModelEstoque){
        return this.daoEstoque.atualizarEstoqueDAO(pModelEstoque);
    }

    /**
    * exclui Estoque
    * @param pId_estoque
    * return boolean
    */
    public boolean excluirEstoqueController(int pId_estoque){
        return this.daoEstoque.excluirEstoqueDAO(pId_estoque);
    }

    public boolean atualizarDisponivelEstoqueController(ArrayList<ModelEstoque> plistaModelEstoque) {
        return this.daoEstoque.salvarEstoqueDAO(plistaModelEstoque);
    }
}