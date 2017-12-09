package controller;

import model.ModelProduto;
import DAO.DAOProduto;
import java.util.ArrayList;

/**
*
* @author AnaCaroline
*/
public class ControllerProduto {

    private DAOProduto daoProduto = new DAOProduto();

    /**
    * grava Produto
    * @param pModelProduto
    * return int
    */
    public int salvarProdutoController(ModelProduto pModelProduto){
        return this.daoProduto.salvarProdutoDAO(pModelProduto);
    }

    /**
    * recupera Produto
    * @param pId_produto
    * return ModelProduto
    */
    public ModelProduto getProdutoController(int pId_produto){
        return this.daoProduto.getProdutoDAO(pId_produto);
    }

    /**
    * recupera uma lista deProduto
    * @param pId_produto
    * return ArrayList
    */
    public ArrayList<ModelProduto> getListaProdutoController(){
        return this.daoProduto.getListaProdutoDAO();
    }

    /**
    * atualiza Produto
    * @param pModelProduto
    * return boolean
    */
    public boolean atualizarProdutoController(ModelProduto pModelProduto){
        return this.daoProduto.atualizarProdutoDAO(pModelProduto);
    }

    /**
    * exclui Produto
    * @param pId_produto
    * return boolean
    */
    public boolean excluirProdutoController(int pId_produto){
        return this.daoProduto.excluirProdutoDAO(pId_produto);
    }
}