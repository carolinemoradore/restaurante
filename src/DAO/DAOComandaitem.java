package DAO;

import model.ModelComandaitem;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author AnaCaroline
*/
public class DAOComandaitem extends ConexaoMySql {

    /**
    * grava Comandaitem
    * @param pModelComandaitem
    * return int
    */
    public int salvarComandaitemDAO(ModelComandaitem pModelComandaitem){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tblcomandaitem ("
                    + "id_comandaitem,"
                    + "id_produto,"
                    + "qdte_comandaitem,"
                    + "valortotal_comandaitem,"
                    + "item_comandaitem"
                + ") VALUES ("
                    + "'" + pModelComandaitem.getId_comandaitem() + "',"
                    + "'" + pModelComandaitem.getId_produto() + "',"
                    + "'" + pModelComandaitem.getQdte_comandaitem() + "',"
                    + "'" + pModelComandaitem.getValortotal_comandaitem() + "',"
                    + "'" + pModelComandaitem.getItem_comandaitem() + "'"
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
    * recupera Comandaitem
    * @param pId_comandaitem
    * return ModelComandaitem
    */
    public ModelComandaitem getComandaitemDAO(int pId_comandaitem){
        ModelComandaitem modelComandaitem = new ModelComandaitem();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_comandaitem,"
                    + "id_produto,"
                    + "qdte_comandaitem,"
                    + "valortotal_comandaitem,"
                    + "item_comandaitem"
                 + " FROM"
                     + " tblcomandaitem"
                 + " WHERE"
                     + "id_comandaitem = '" + pId_comandaitem + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelComandaitem.setId_comandaitem(this.getResultSet().getInt(1));
                modelComandaitem.setId_produto(this.getResultSet().getInt(2));
                modelComandaitem.setQdte_comandaitem(this.getResultSet().getDouble(3));
                modelComandaitem.setValortotal_comandaitem(this.getResultSet().getDouble(4));
                modelComandaitem.setItem_comandaitem(this.getResultSet().getInt(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelComandaitem;
    }

    /**
    * recupera uma lista de Comandaitem
        * return ArrayList
    */
    public ArrayList<ModelComandaitem> getListaComandaitemDAO(){
        ArrayList<ModelComandaitem> listamodelComandaitem = new ArrayList();
        ModelComandaitem modelComandaitem = new ModelComandaitem();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_comandaitem,"
                    + "id_produto,"
                    + "qdte_comandaitem,"
                    + "valortotal_comandaitem,"
                    + "item_comandaitem"
                 + " FROM"
                     + " tblcomandaitem"
                + ";"
            );

            while(this.getResultSet().next()){
                modelComandaitem = new ModelComandaitem();
                modelComandaitem.setId_comandaitem(this.getResultSet().getInt(1));
                modelComandaitem.setId_produto(this.getResultSet().getInt(2));
                modelComandaitem.setQdte_comandaitem(this.getResultSet().getDouble(3));
                modelComandaitem.setValortotal_comandaitem(this.getResultSet().getDouble(4));
                modelComandaitem.setItem_comandaitem(this.getResultSet().getInt(5));
                listamodelComandaitem.add(modelComandaitem);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelComandaitem;
    }

    /**
    * atualiza Comandaitem
    * @param pModelComandaitem
    * return boolean
    */
    public boolean atualizarComandaitemDAO(ModelComandaitem pModelComandaitem){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tblcomandaitem SET "
                    + "id_comandaitem = '" + pModelComandaitem.getId_comandaitem() + "',"
                    + "id_produto = '" + pModelComandaitem.getId_produto() + "',"
                    + "qdte_comandaitem = '" + pModelComandaitem.getQdte_comandaitem() + "',"
                    + "valortotal_comandaitem = '" + pModelComandaitem.getValortotal_comandaitem() + "',"
                    + "item_comandaitem = '" + pModelComandaitem.getItem_comandaitem() + "'"
                + " WHERE "
                    + "id_comandaitem = '" + pModelComandaitem.getId_comandaitem() + "'"
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
    * exclui Comandaitem
    * @param pId_comandaitem
    * return boolean
    */
    public boolean excluirComandaitemDAO(int pId_comandaitem){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tblcomandaitem "
                + " WHERE "
                    + "id_comandaitem = '" + pId_comandaitem + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    public boolean salvarComandaitemDAO(ArrayList<ModelComandaitem> plistaModelComandaitem) {
        try {
            this.conectar();
            int cont = plistaModelComandaitem.size();
            for(int i = 0; i < cont; i++){
             this.insertSQL(
                "INSERT INTO tblcomandaitem ("
                    + "id_comandaitem,"
                    + "id_produto,"
                    + "qdte_comandaitem,"
                    + "valortotal_comandaitem,"
                    + "item_comandaitem"
                + ") VALUES ("
                    + "'" + plistaModelComandaitem.get(i).getId_comandaitem() + "',"
                    + "'" + plistaModelComandaitem.get(i).getId_produto() + "',"
                    + "'" + plistaModelComandaitem.get(i).getQdte_comandaitem() + "',"
                    + "'" + plistaModelComandaitem.get(i).getValortotal_comandaitem() + "',"
                    + "'" + plistaModelComandaitem.get(i).getItem_comandaitem() + "'"
                + ");"
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