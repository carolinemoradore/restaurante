package DAO;

import model.ModelProduto;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author AnaCaroline
*/
public class DAOProduto extends ConexaoMySql {

    /**
    * grava Produto
    * @param pModelProduto
    * return int
    */
    public int salvarProdutoDAO(ModelProduto pModelProduto){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tblproduto ("
                    + "id_produto,"
                    + "descricao_produto,"
                    + "unidade_produto,"
                    + "preco_produto,"
                    + "fornecedor_produto"
                + ") VALUES ("
                    + "'" + pModelProduto.getId_produto() + "',"
                    + "'" + pModelProduto.getDescricao_produto() + "',"
                    + "'" + pModelProduto.getUnidade_produto() + "',"
                    + "'" + pModelProduto.getPreco_produto() + "',"
                    + "'" + pModelProduto.getFornecedor_produto() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera Produto
    * @param pId_produto
    * return ModelProduto
    */
    public ModelProduto getProdutoDAO(int pId_produto){
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_produto,"
                    + "descricao_produto,"
                    + "unidade_produto,"
                    + "preco_produto,"
                    + "fornecedor_produto,"
                    + "nome_fornecedor"
                 + " FROM"
                     + " tblproduto "
                     + " inner join tblfornecedor on (fornecedor_produto = id_fornecedor)"
                 + " WHERE"
                     + " id_produto = '" + pId_produto + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelProduto.setId_produto(this.getResultSet().getInt(1));
                modelProduto.setDescricao_produto(this.getResultSet().getString(2));
                modelProduto.setUnidade_produto(this.getResultSet().getString(3));
                modelProduto.setPreco_produto(this.getResultSet().getDouble(4));
                modelProduto.setFornecedor_produto(this.getResultSet().getInt(5));
                modelProduto.setNome_fornecedor(this.getResultSet().getString(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelProduto;
    }

    /**
    * recupera uma lista de Produto
        * return ArrayList
    */
    public ArrayList<ModelProduto> getListaProdutoDAO(){
        ArrayList<ModelProduto> listamodelProduto = new ArrayList();
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_produto,"
                    + "descricao_produto,"
                    + "unidade_produto,"
                    + "preco_produto,"
                    + "fornecedor_produto,"
                    + "nome_fornecedor"
                 + " FROM"
                     + " tblproduto "
                     + " inner join tblfornecedor on (fornecedor_produto = id_fornecedor)"
                + ";"
            );

            while(this.getResultSet().next()){
                modelProduto = new ModelProduto();
                modelProduto.setId_produto(this.getResultSet().getInt(1));
                modelProduto.setDescricao_produto(this.getResultSet().getString(2));
                modelProduto.setUnidade_produto(this.getResultSet().getString(3));
                modelProduto.setPreco_produto(this.getResultSet().getDouble(4));
                modelProduto.setFornecedor_produto(this.getResultSet().getInt(5));
                modelProduto.setNome_fornecedor(this.getResultSet().getString(6));
                listamodelProduto.add(modelProduto);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelProduto;
    }

    /**
    * atualiza Produto
    * @param pModelProduto
    * return boolean
    */
    public boolean atualizarProdutoDAO(ModelProduto pModelProduto){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tblproduto SET "
                    + "id_produto = '" + pModelProduto.getId_produto() + "',"
                    + "descricao_produto = '" + pModelProduto.getDescricao_produto() + "',"
                    + "unidade_produto = '" + pModelProduto.getUnidade_produto() + "',"
                    + "preco_produto = '" + pModelProduto.getPreco_produto() + "',"
                    + "fornecedor_produto = '" + pModelProduto.getFornecedor_produto() + "'"
                + " WHERE "
                    + "id_produto = '" + pModelProduto.getId_produto() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui Produto
    * @param pId_produto
    * return boolean
    */
    public boolean excluirProdutoDAO(int pId_produto){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tblproduto "
                + " WHERE "
                    + "id_produto = '" + pId_produto + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}