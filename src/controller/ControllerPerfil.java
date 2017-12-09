package controller;

import model.ModelPerfil;
import DAO.DAOPerfil;
import java.util.ArrayList;

/**
*
* @author AnaCaroline
*/
public class ControllerPerfil {

    private DAOPerfil daoPerfil = new DAOPerfil();

    /**
    * grava Perfil
    * @param pModelPerfil
    * return int
    */
    public int salvarPerfilController(ModelPerfil pModelPerfil){
        return this.daoPerfil.salvarPerfilDAO(pModelPerfil);
    }

    /**
    * recupera Perfil
    * @param pId_perfil
    * return ModelPerfil
    */
    public ModelPerfil getPerfilController(int pId_perfil){
        return this.daoPerfil.getPerfilDAO(pId_perfil);
    }

    /**
    * recupera uma lista dePerfil
    * @param pId_perfil
    * return ArrayList
    */
    public ArrayList<ModelPerfil> getListaPerfilController(){
        return this.daoPerfil.getListaPerfilDAO();
    }

    /**
    * atualiza Perfil
    * @param pModelPerfil
    * return boolean
    */
    public boolean atualizarPerfilController(ModelPerfil pModelPerfil){
        return this.daoPerfil.atualizarPerfilDAO(pModelPerfil);
    }

    /**
    * exclui Perfil
    * @param pId_perfil
    * return boolean
    */
    public boolean excluirPerfilController(int pId_perfil){
        return this.daoPerfil.excluirPerfilDAO(pId_perfil);
    }
}