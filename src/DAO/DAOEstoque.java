package DAO;

import model.ModelEstoque;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author AnaCaroline
*/
public class DAOEstoque extends ConexaoMySql {

    /**
    * grava Estoque
    * @param pModelEstoque
    * return int
    */
    public int salvarEstoqueDAO(ModelEstoque pModelEstoque){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tblestoque ("
                    + "id_estoque,"
                    + "produto_estoque,"
                    + "qtdeminima_estoque,"
                    + "qtdemaxima_estoque,"
                    + "qtdatual_estoque"
                + ") VALUES ("
                    + "'" + pModelEstoque.getId_estoque() + "',"
                    + "'" + pModelEstoque.getProduto_estoque() + "',"
                    + "'" + pModelEstoque.getQtdeminima_estoque() + "',"
                    + "'" + pModelEstoque.getQtdemaxima_estoque() + "',"
                    + "'" + pModelEstoque.getQtdatual_estoque() + "'"
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
    * recupera Estoque
    * @param pId_estoque
    * return ModelEstoque
    */
    public ModelEstoque getEstoqueDAO(int pId_estoque){
        ModelEstoque modelEstoque = new ModelEstoque();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_estoque,"
                    + "produto_estoque,"
                    + "qtdeminima_estoque,"
                    + "qtdemaxima_estoque,"
                    + "qtdatual_estoque,"
                    + "descricao_produto,"
                    + "preco_produto"
                 + " FROM"
                     + " tblestoque "
                     + " inner join tblproduto on (produto_estoque = id_produto) "
                 + " WHERE"
                     + " id_estoque = '" + pId_estoque + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelEstoque.setId_estoque(this.getResultSet().getInt(1));
                modelEstoque.setProduto_estoque(this.getResultSet().getInt(2));
                modelEstoque.setQtdeminima_estoque(this.getResultSet().getDouble(3));
                modelEstoque.setQtdemaxima_estoque(this.getResultSet().getDouble(4));
                modelEstoque.setQtdatual_estoque(this.getResultSet().getDouble(5));
                modelEstoque.setDescricao_produto(this.getResultSet().getString(6));
                modelEstoque.setPreco_produto(this.getResultSet().getDouble(7));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelEstoque;
    }

    /**
    * recupera uma lista de Estoque
        * return ArrayList
    */
    public ArrayList<ModelEstoque> getListaEstoqueDAO(){
        ArrayList<ModelEstoque> listamodelEstoque = new ArrayList();
        ModelEstoque modelEstoque = new ModelEstoque();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_estoque,"
                    + "produto_estoque,"
                    + "qtdeminima_estoque,"
                    + "qtdemaxima_estoque,"
                    + "qtdatual_estoque,"
                    + "descricao_produto"
                 + " FROM"
                     + " tblestoque "
                     + " inner join tblproduto on (produto_estoque = id_produto) "
                + ";"
            );

            while(this.getResultSet().next()){
                modelEstoque = new ModelEstoque();
                modelEstoque.setId_estoque(this.getResultSet().getInt(1));
                modelEstoque.setProduto_estoque(this.getResultSet().getInt(2));
                modelEstoque.setQtdeminima_estoque(this.getResultSet().getDouble(3));
                modelEstoque.setQtdemaxima_estoque(this.getResultSet().getDouble(4));
                modelEstoque.setQtdatual_estoque(this.getResultSet().getDouble(5));
                modelEstoque.setDescricao_produto(this.getResultSet().getString(6));
                listamodelEstoque.add(modelEstoque);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelEstoque;
    }

    /**
    * atualiza Estoque
    * @param pModelEstoque
    * return boolean
    */
    public boolean atualizarEstoqueDAO(ModelEstoque pModelEstoque){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tblestoque SET "
                    + "id_estoque = '" + pModelEstoque.getId_estoque() + "',"
                    + "produto_estoque = '" + pModelEstoque.getProduto_estoque() + "',"
                    + "qtdeminima_estoque = '" + pModelEstoque.getQtdeminima_estoque() + "',"
                    + "qtdemaxima_estoque = '" + pModelEstoque.getQtdemaxima_estoque() + "',"
                    + "qtdatual_estoque = '" + pModelEstoque.getQtdatual_estoque() + "'"
                + " WHERE "
                    + "id_estoque = '" + pModelEstoque.getId_estoque() + "'"
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
    * exclui Estoque
    * @param pId_estoque
    * return boolean
    */
    public boolean excluirEstoqueDAO(int pId_estoque){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tblestoque "
                + " WHERE "
                    + "id_estoque = '" + pId_estoque + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    public boolean salvarEstoqueDAO(ArrayList<ModelEstoque> plistaModelEstoque) {
        try {
            this.conectar();
            int cont = plistaModelEstoque.size();
            for(int i = 0; i < cont; i++){
            return this.executarUpdateDeleteSQL(
                "UPDATE tblestoque SET "
                    + " qtdatual_estoque = qtdatual_estoque - '" + plistaModelEstoque.get(i).getQtdatual_estoque() + "'"
                + " WHERE "
                    + "id_estoque = '" + plistaModelEstoque.get(i).getId_estoque() + "'"
                + ";"
            );
            }
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
        
        
    }
}