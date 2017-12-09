package DAO;

import model.ModelCliente;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author AnaCaroline
*/
public class DAOCliente extends ConexaoMySql {

    /**
    * grava Cliente
    * @param pModelCliente
    * return int
    */
    public int salvarClienteDAO(ModelCliente pModelCliente){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tblcliente ("
                    + "id_cliente,"
                    + "nome_cliente,"
                    + "cpf_cliente,"
                    + "cep_cliente,"
                    + "endereco_cliente,"
                    + "bairro_cliente,"
                    + "uf_cliente,"
                    + "sexo_cliente,"
                    + "estadocivil_cliente,"
                    + "promocoes_cliente,"
                    + "cidade_cliente"
                + ") VALUES ("
                    + "'" + pModelCliente.getId_cliente() + "',"
                    + "'" + pModelCliente.getNome_cliente() + "',"
                    + "'" + pModelCliente.getCpf_cliente() + "',"
                    + "'" + pModelCliente.getCep_cliente() + "',"
                    + "'" + pModelCliente.getEndereco_cliente() + "',"
                    + "'" + pModelCliente.getBairro_cliente() + "',"
                    + "'" + pModelCliente.getUf_cliente() + "',"
                    + "'" + pModelCliente.getSexo_cliente() + "',"
                    + "'" + pModelCliente.getEstadocivil_cliente() + "',"
                    + "'" + pModelCliente.getPromocoes_cliente() + "',"
                    + "'" + pModelCliente.getCidade_cliente() + "'"
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
    * recupera Cliente
    * @param pId_cliente
    * return ModelCliente
    */
    public ModelCliente getClienteDAO(int pId_cliente){
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_cliente,"
                    + "nome_cliente,"
                    + "cpf_cliente,"
                    + "cep_cliente,"
                    + "endereco_cliente,"
                    + "bairro_cliente,"
                    + "uf_cliente,"
                    + "sexo_cliente,"
                    + "estadocivil_cliente,"
                    + "promocoes_cliente,"
                    + "cidade_cliente"
                 + " FROM"
                     + " tblcliente"
                 + " WHERE"
                     + " id_cliente = '" + pId_cliente + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente.setId_cliente(this.getResultSet().getInt(1));
                modelCliente.setNome_cliente(this.getResultSet().getString(2));
                modelCliente.setCpf_cliente(this.getResultSet().getString(3));
                modelCliente.setCep_cliente(this.getResultSet().getString(4));
                modelCliente.setEndereco_cliente(this.getResultSet().getString(5));
                modelCliente.setBairro_cliente(this.getResultSet().getString(6));
                modelCliente.setUf_cliente(this.getResultSet().getString(7));
                modelCliente.setSexo_cliente(this.getResultSet().getString(8));
                modelCliente.setEstadocivil_cliente(this.getResultSet().getString(9));
                modelCliente.setPromocoes_cliente(this.getResultSet().getInt(10));
                modelCliente.setCidade_cliente(this.getResultSet().getString(11));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCliente;
    }

    /**
    * recupera uma lista de Cliente
        * return ArrayList
    */
    public ArrayList<ModelCliente> getListaClienteDAO(){
        ArrayList<ModelCliente> listamodelCliente = new ArrayList();
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_cliente,"
                    + "nome_cliente,"
                    + "cpf_cliente,"
                    + "cep_cliente,"
                    + "endereco_cliente,"
                    + "bairro_cliente,"
                    + "uf_cliente,"
                    + "sexo_cliente,"
                    + "estadocivil_cliente,"
                    + "promocoes_cliente,"
                    + "cidade_cliente"
                 + " FROM"
                     + " tblcliente"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente = new ModelCliente();
                modelCliente.setId_cliente(this.getResultSet().getInt(1));
                modelCliente.setNome_cliente(this.getResultSet().getString(2));
                modelCliente.setCpf_cliente(this.getResultSet().getString(3));
                modelCliente.setCep_cliente(this.getResultSet().getString(4));
                modelCliente.setEndereco_cliente(this.getResultSet().getString(5));
                modelCliente.setBairro_cliente(this.getResultSet().getString(6));
                modelCliente.setUf_cliente(this.getResultSet().getString(7));
                modelCliente.setSexo_cliente(this.getResultSet().getString(8));
                modelCliente.setEstadocivil_cliente(this.getResultSet().getString(9));
                modelCliente.setPromocoes_cliente(this.getResultSet().getInt(10));
                modelCliente.setCidade_cliente(this.getResultSet().getString(11));
                listamodelCliente.add(modelCliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelCliente;
    }

    /**
    * atualiza Cliente
    * @param pModelCliente
    * return boolean
    */
    public boolean atualizarClienteDAO(ModelCliente pModelCliente){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tblcliente SET "
                    + "id_cliente = '" + pModelCliente.getId_cliente() + "',"
                    + "nome_cliente = '" + pModelCliente.getNome_cliente() + "',"
                    + "cpf_cliente = '" + pModelCliente.getCpf_cliente() + "',"
                    + "cep_cliente = '" + pModelCliente.getCep_cliente() + "',"
                    + "endereco_cliente = '" + pModelCliente.getEndereco_cliente() + "',"
                    + "bairro_cliente = '" + pModelCliente.getBairro_cliente() + "',"
                    + "uf_cliente = '" + pModelCliente.getUf_cliente() + "',"
                    + "sexo_cliente = '" + pModelCliente.getSexo_cliente() + "',"
                    + "estadocivil_cliente = '" + pModelCliente.getEstadocivil_cliente() + "',"
                    + "promocoes_cliente = '" + pModelCliente.getPromocoes_cliente() + "',"
                    + "cidade_cliente = '" + pModelCliente.getCidade_cliente() + "'"
                + " WHERE "
                    + "id_cliente = '" + pModelCliente.getId_cliente() + "'"
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
    * exclui Cliente
    * @param pId_cliente
    * return boolean
    */
    public boolean excluirClienteDAO(int pId_cliente){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tblcliente "
                + " WHERE "
                    + "2id_cliente = '" + pId_cliente + "'"
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