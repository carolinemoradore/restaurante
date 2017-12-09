package DAO;

import model.ModelFornecedor;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author AnaCaroline
*/
public class DAOFornecedor extends ConexaoMySql {

    /**
    * grava Fornecedor
    * @param pModelFornecedor
    * return int
    */
    public int salvarFornecedorDAO(ModelFornecedor pModelFornecedor){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tblfornecedor ("
                    //+ "id_fornecedor,"
                    + "nome_fornecedor,"
                    + "cnpj_fornecedor,"
                    + "cep_fornecedor,"
                    + "endereco_fornecedor,"
                    + "bairro_fornecedor,"
                    + "cidade_fornecedor,"
                    + "uf_fornecedor"
                + ") VALUES ("
                    //+ "'" + pModelFornecedor.getId_fornecedor() + "',"
                    + "'" + pModelFornecedor.getNome_fornecedor() + "',"
                    + "'" + pModelFornecedor.getCnpj_fornecedor() + "',"
                    + "'" + pModelFornecedor.getCep_fornecedor() + "',"
                    + "'" + pModelFornecedor.getEndereco_fornecedor() + "',"
                    + "'" + pModelFornecedor.getBairro_fornecedor() + "',"
                    + "'" + pModelFornecedor.getCidade_fornecedor() + "',"
                    + "'" + pModelFornecedor.getUf_fornecedor() + "'"
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
    * recupera Fornecedor
    * @param pId_fornecedor
    * return ModelFornecedor
    */
    public ModelFornecedor getFornecedorDAO(int pId_fornecedor){
        ModelFornecedor modelFornecedor = new ModelFornecedor();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_fornecedor,"
                    + "nome_fornecedor,"
                    + "cnpj_fornecedor,"
                    + "cep_fornecedor,"
                    + "endereco_fornecedor,"
                    + "bairro_fornecedor,"
                    + "cidade_fornecedor,"
                    + "uf_fornecedor"
                 + " FROM"
                     + " tblfornecedor"
                 + " WHERE"
                     + " id_fornecedor = '" + pId_fornecedor + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFornecedor.setId_fornecedor(this.getResultSet().getInt(1));
                modelFornecedor.setNome_fornecedor(this.getResultSet().getString(2));
                modelFornecedor.setCnpj_fornecedor(this.getResultSet().getString(3));
                modelFornecedor.setCep_fornecedor(this.getResultSet().getString(4));
                modelFornecedor.setEndereco_fornecedor(this.getResultSet().getString(5));
                modelFornecedor.setBairro_fornecedor(this.getResultSet().getString(6));
                modelFornecedor.setCidade_fornecedor(this.getResultSet().getString(7));
                modelFornecedor.setUf_fornecedor(this.getResultSet().getString(8));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelFornecedor;
    }

    /**
    * recupera uma lista de Fornecedor
        * return ArrayList
    */
    public ArrayList<ModelFornecedor> getListaFornecedorDAO(){
        ArrayList<ModelFornecedor> listamodelFornecedor = new ArrayList();
        ModelFornecedor modelFornecedor = new ModelFornecedor();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_fornecedor,"
                    + "nome_fornecedor,"
                    + "cnpj_fornecedor,"
                    + "cep_fornecedor,"
                    + "endereco_fornecedor,"
                    + "bairro_fornecedor,"
                    + "cidade_fornecedor,"
                    + "uf_fornecedor"
                 + " FROM"
                     + " tblfornecedor"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFornecedor = new ModelFornecedor();
                modelFornecedor.setId_fornecedor(this.getResultSet().getInt(1));
                modelFornecedor.setNome_fornecedor(this.getResultSet().getString(2));
                modelFornecedor.setCnpj_fornecedor(this.getResultSet().getString(3));
                modelFornecedor.setCep_fornecedor(this.getResultSet().getString(4));
                modelFornecedor.setEndereco_fornecedor(this.getResultSet().getString(5));
                modelFornecedor.setBairro_fornecedor(this.getResultSet().getString(6));
                modelFornecedor.setCidade_fornecedor(this.getResultSet().getString(7));
                modelFornecedor.setUf_fornecedor(this.getResultSet().getString(8));
                listamodelFornecedor.add(modelFornecedor);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelFornecedor;
    }

    /**
    * atualiza Fornecedor
    * @param pModelFornecedor
    * return boolean
    */
    public boolean atualizarFornecedorDAO(ModelFornecedor pModelFornecedor){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tblfornecedor SET "
                    + "id_fornecedor = '" + pModelFornecedor.getId_fornecedor() + "',"
                    + "nome_fornecedor = '" + pModelFornecedor.getNome_fornecedor() + "',"
                    + "cnpj_fornecedor = '" + pModelFornecedor.getCnpj_fornecedor() + "',"
                    + "cep_fornecedor = '" + pModelFornecedor.getCep_fornecedor() + "',"
                    + "endereco_fornecedor = '" + pModelFornecedor.getEndereco_fornecedor() + "',"
                    + "bairro_fornecedor = '" + pModelFornecedor.getBairro_fornecedor() + "',"
                    + "cidade_fornecedor = '" + pModelFornecedor.getCidade_fornecedor() + "',"
                    + "uf_fornecedor = '" + pModelFornecedor.getUf_fornecedor() + "'"
                + " WHERE "
                    + "id_fornecedor = '" + pModelFornecedor.getId_fornecedor() + "'"
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
    * exclui Fornecedor
    * @param pId_fornecedor
    * return boolean
    */
    public boolean excluirFornecedorDAO(int pId_fornecedor){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tblfornecedor "
                + " WHERE "
                    + "id_fornecedor = '" + pId_fornecedor + "'"
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