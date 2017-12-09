package DAO;

import model.ModelUsuario;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author AnaCaroline
*/
public class DAOUsuario extends ConexaoMySql {

    /**
    * grava Usuario
    * @param pModelUsuario
    * return int
    */
    public int salvarUsuarioDAO(ModelUsuario pModelUsuario){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tblusuario ("
                    + "id_usuario,"
                    + "nome_usuario,"
                    + "login_usuario,"
                    + "senha_usuario,"
                    + "situacao_usuario,"
                    + "perfil_usuario"
                + ") VALUES ("
                    + "'" + pModelUsuario.getId_usuario() + "',"
                    + "'" + pModelUsuario.getNome_usuario() + "',"
                    + "'" + pModelUsuario.getLogin_usuario() + "',"
                    + "'" + pModelUsuario.getSenha_usuario() + "',"
                    + "'" + pModelUsuario.getSituacao_usuario() + "',"
                    + "'" + pModelUsuario.getPerfil_usuario() + "'"
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
    * recupera Usuario
    * @param pId_usuario
    * return ModelUsuario
    */
    public ModelUsuario getUsuarioDAO(int pId_usuario){
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_usuario,"
                    + "nome_usuario,"
                    + "login_usuario,"
                    + "senha_usuario,"
                    + "situacao_usuario,"
                    + "perfil_usuario,"
                    + "nome_perfil"
                 + " FROM"
                     + " tblusuario"
                     + " inner join tblperfil on (perfil_usuario = id_perfil)"  
                 + " WHERE"
                     + " id_usuario = '" + pId_usuario + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUsuario.setId_usuario(this.getResultSet().getInt(1));
                modelUsuario.setNome_usuario(this.getResultSet().getString(2));
                modelUsuario.setLogin_usuario(this.getResultSet().getString(3));
                modelUsuario.setSenha_usuario(this.getResultSet().getString(4));
                modelUsuario.setSituacao_usuario(this.getResultSet().getString(5));
                modelUsuario.setPerfil_usuario(this.getResultSet().getInt(6));
                modelUsuario.setNome_perfil(this.getResultSet().getString(7));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelUsuario;
    }

    /**
    * recupera uma lista de Usuario
        * return ArrayList
    */
    public ArrayList<ModelUsuario> getListaUsuarioDAO(){
        ArrayList<ModelUsuario> listamodelUsuario = new ArrayList();
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_usuario,"
                    + "nome_usuario,"
                    + "login_usuario,"
                    + "senha_usuario,"
                    + "situacao_usuario,"
                    + "perfil_usuario,"
                    + "nome_perfil"
                 + " FROM"
                     + " tblusuario"
                     + " inner join tblperfil on (perfil_usuario = id_perfil)"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUsuario = new ModelUsuario();
                modelUsuario.setId_usuario(this.getResultSet().getInt(1));
                modelUsuario.setNome_usuario(this.getResultSet().getString(2));
                modelUsuario.setLogin_usuario(this.getResultSet().getString(3));
                modelUsuario.setSenha_usuario(this.getResultSet().getString(4));
                modelUsuario.setSituacao_usuario(this.getResultSet().getString(5));
                modelUsuario.setPerfil_usuario(this.getResultSet().getInt(6));
                modelUsuario.setNome_perfil(this.getResultSet().getString(7));
                listamodelUsuario.add(modelUsuario);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelUsuario;
    }

    /**
    * atualiza Usuario
    * @param pModelUsuario
    * return boolean
    */
    public boolean atualizarUsuarioDAO(ModelUsuario pModelUsuario){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tblusuario SET "
                    + "id_usuario = '" + pModelUsuario.getId_usuario() + "',"
                    + "nome_usuario = '" + pModelUsuario.getNome_usuario() + "',"
                    + "login_usuario = '" + pModelUsuario.getLogin_usuario() + "',"
                    + "senha_usuario = '" + pModelUsuario.getSenha_usuario() + "',"
                    + "situacao_usuario = '" + pModelUsuario.getSituacao_usuario() + "',"
                    + "perfil_usuario = '" + pModelUsuario.getPerfil_usuario() + "'"
                + " WHERE "
                    + "id_usuario = '" + pModelUsuario.getId_usuario() + "'"
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
    * exclui Usuario
    * @param pId_usuario
    * return boolean
    */
    public boolean excluirUsuarioDAO(int pId_usuario){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tblusuario "
                + " WHERE "
                    + "id_usuario = '" + pId_usuario + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    public boolean validarUsuarioDAO(ModelUsuario pModelUsuario) {
       try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_usuario,"
                    + "nome_usuario,"
                    + "login_usuario,"
                    + "senha_usuario,"
                    + "situacao_usuario,"
                    + "perfil_usuario,"
                    + "nome_perfil"
                 + " FROM"
                     + " tblusuario"
                     + " inner join tblperfil on (perfil_usuario = id_perfil)"
                 + " WHERE"
                     + " login_usuario = '" + pModelUsuario.getLogin_usuario() + "' and "+
                    "senha_usuario = '" + pModelUsuario.getSenha_usuario() + "'"
                + ";"
            );

            if(getResultSet().next()){
              return true;   
            }else{
              return false;    
            }
                
        }catch(Exception e){
            return false;    
        }finally{
            this.fecharConexao();
        }
        
    }
}