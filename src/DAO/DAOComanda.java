package DAO;

import model.ModelComanda;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author AnaCaroline
*/
public class DAOComanda extends ConexaoMySql {

    /**
    * grava Comanda
    * @param pModelComanda
    * return int
    */
    public int salvarComandaDAO(ModelComanda pModelComanda){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tblcomanda ("
                    + "id_comanda,"
                    + "cliente_comanda,"
                    + "data_comanda,"
                    + "bruto_comanda,"
                    + "desconto_comanda,"
                    + "liquido_comanda"
                + ") VALUES ("
                    + "'" + pModelComanda.getId_comanda() + "',"
                    + "'" + pModelComanda.getCliente_comanda() + "',"
                    + "'" + pModelComanda.getData_comanda() + "',"
                    + "'" + pModelComanda.getBruto_comanda() + "',"
                    + "'" + pModelComanda.getDesconto_comanda() + "',"
                    + "'" + pModelComanda.getLiquido_comanda() + "'"
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
    * recupera Comanda
    * @param pId_comanda
    * return ModelComanda
    */
    public ModelComanda getComandaDAO(int pId_comanda){
        ModelComanda modelComanda = new ModelComanda();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_comanda,"
                    + "cliente_comanda,"
                    + "data_comanda,"
                    + "bruto_comanda,"
                    + "desconto_comanda,"
                    + "liquido_comanda"
                 + " FROM"
                     + " tblcomanda"
                 + " WHERE"
                     + " id_comanda = '" + pId_comanda + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelComanda.setId_comanda(this.getResultSet().getInt(1));
                modelComanda.setCliente_comanda(this.getResultSet().getInt(2));
                modelComanda.setData_comanda(this.getResultSet().getDate(3));
                modelComanda.setBruto_comanda(this.getResultSet().getDouble(4));
                modelComanda.setDesconto_comanda(this.getResultSet().getDouble(5));
                modelComanda.setLiquido_comanda(this.getResultSet().getDouble(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelComanda;
    }

    /**
    * recupera uma lista de Comanda
        * return ArrayList
    */
    public ArrayList<ModelComanda> getListaComandaDAO(){
        ArrayList<ModelComanda> listamodelComanda = new ArrayList();
        ModelComanda modelComanda = new ModelComanda();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_comanda,"
                    + "cliente_comanda,"
                    + "data_comanda,"
                    + "bruto_comanda,"
                    + "desconto_comanda,"
                    + "liquido_comanda"
                 + " FROM"
                     + " tblcomanda"
                + ";"
            );

            while(this.getResultSet().next()){
                modelComanda = new ModelComanda();
                modelComanda.setId_comanda(this.getResultSet().getInt(1));
                modelComanda.setCliente_comanda(this.getResultSet().getInt(2));
                modelComanda.setData_comanda(this.getResultSet().getDate(3));
                modelComanda.setBruto_comanda(this.getResultSet().getDouble(4));
                modelComanda.setDesconto_comanda(this.getResultSet().getDouble(5));
                modelComanda.setLiquido_comanda(this.getResultSet().getDouble(6));
                listamodelComanda.add(modelComanda);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelComanda;
    }

    /**
    * atualiza Comanda
    * @param pModelComanda
    * return boolean
    */
    public boolean atualizarComandaDAO(ModelComanda pModelComanda){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tblcomanda SET "
                    + "id_comanda = '" + pModelComanda.getId_comanda() + "',"
                    + "cliente_comanda = '" + pModelComanda.getCliente_comanda() + "',"
                    + "data_comanda = '" + pModelComanda.getData_comanda() + "',"
                    + "bruto_comanda = '" + pModelComanda.getBruto_comanda() + "',"
                    + "desconto_comanda = '" + pModelComanda.getDesconto_comanda() + "',"
                    + "liquido_comanda = '" + pModelComanda.getLiquido_comanda() + "'"
                + " WHERE "
                    + "id_comanda = '" + pModelComanda.getId_comanda() + "'"
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
    * exclui Comanda
    * @param pId_comanda
    * return boolean
    */
    public boolean excluirComandaDAO(int pId_comanda){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tblcomanda "
                + " WHERE "
                    + "id_comanda = '" + pId_comanda + "'"
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