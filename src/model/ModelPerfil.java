package model;
/**
*
* @author AnaCaroline
*/
public class ModelPerfil {

    private int id_perfil;
    private String nome_perfil;

    /**
    * Construtor
    */
    public ModelPerfil(){}

    /**
    * seta o valor de id_perfil
    * @param pId_perfil
    */
    public void setId_perfil(int pId_perfil){
        this.id_perfil = pId_perfil;
    }
    /**
    * return pk_id_perfil
    */
    public int getId_perfil(){
        return this.id_perfil;
    }

    /**
    * seta o valor de nome_perfil
    * @param pNome_perfil
    */
    public void setNome_perfil(String pNome_perfil){
        this.nome_perfil = pNome_perfil;
    }
    /**
    * return nome_perfil
    */
    public String getNome_perfil(){
        return this.nome_perfil;
    }

    @Override
    public String toString(){
        return "ModelPerfil {" + "::id_perfil = " + this.id_perfil + "::nome_perfil = " + this.nome_perfil +  "}";
    }
}