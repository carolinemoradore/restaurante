package DAO;

import model.ModelPerfil;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author AnaCaroline
*/
public class DAOPerfil extends ConexaoMySql {

    /**
    * grava Perfil
    * @param pModelPerfil
    * return int
    */
    public int salvarPerfilDAO(ModelPerfil pModelPerfil){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tblperfil ("
                    + "id_perfil,"
                    + "nome_perfil"
                + ") VALUES ("
                    + "'" + pModelPerfil.getId_perfil() + "',"
                    + "'" + pModelPerfil.getNome_perfil() + "'"
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
    * recupera Perfil
    * @param pId_perfil
    * return ModelPerfil
    */
    public ModelPerfil getPerfilDAO(int pId_perfil){
        ModelPerfil modelPerfil = new ModelPerfil();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_perfil,"
                    + "nome_perfil"
                 + " FROM"
                     + " tblperfil"
                 + " WHERE"
                     + " id_perfil = '" + pId_perfil + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelPerfil.setId_perfil(this.getResultSet().getInt(1));
                modelPerfil.setNome_perfil(this.getResultSet().getString(2));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelPerfil;
    }

    /**
    * recupera uma lista de Perfil
        * return ArrayList
    */
    public ArrayList<ModelPerfil> getListaPerfilDAO(){
        ArrayList<ModelPerfil> listamodelPerfil = new ArrayList();
        ModelPerfil modelPerfil = new ModelPerfil();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_perfil,"
                    + "nome_perfil"
                 + " FROM"
                     + " tblperfil"
                + ";"
            );

            while(this.getResultSet().next()){
                modelPerfil = new ModelPerfil();
                modelPerfil.setId_perfil(this.getResultSet().getInt(1));
                modelPerfil.setNome_perfil(this.getResultSet().getString(2));
                listamodelPerfil.add(modelPerfil);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelPerfil;
    }

    /**
    * atualiza Perfil
    * @param pModelPerfil
    * return boolean
    */
    public boolean atualizarPerfilDAO(ModelPerfil pModelPerfil){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tblperfil SET "
                    + "id_perfil = '" + pModelPerfil.getId_perfil() + "',"
                    + "nome_perfil = '" + pModelPerfil.getNome_perfil() + "'"
                + " WHERE "
                    + "id_perfil = '" + pModelPerfil.getId_perfil() + "'"
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
    * exclui Perfil
    * @param pId_perfil
    * return boolean
    */
    public boolean excluirPerfilDAO(int pId_perfil){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tblperfil "
                + " WHERE "
                    + "id_perfil = '" + pId_perfil + "'"
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