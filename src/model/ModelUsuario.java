package model;
/**
*
* @author AnaCaroline
*/
public class ModelUsuario {

    private int id_usuario;
    private String nome_usuario;
    private String login_usuario;
    private String senha_usuario;
    private String situacao_usuario;
    private String nome_perfil;
    private int perfil_usuario;

    /**
    * Construtor
    */
    public ModelUsuario(){}

    /**
    * seta o valor de id_usuario
    * @param pId_usuario
    */
    public void setId_usuario(int pId_usuario){
        this.id_usuario = pId_usuario;
    }
    /**
    * return pk_id_usuario
    */
    public int getId_usuario(){
        return this.id_usuario;
    }

    /**
    * seta o valor de nome_usuario
    * @param pNome_usuario
    */
    public void setNome_usuario(String pNome_usuario){
        this.nome_usuario = pNome_usuario;
    }
    /**
    * return nome_usuario
    */
    public String getNome_usuario(){
        return this.nome_usuario;
    }

    /**
    * seta o valor de login_usuario
    * @param pLogin_usuario
    */
    public void setLogin_usuario(String pLogin_usuario){
        this.login_usuario = pLogin_usuario;
    }
    /**
    * return login_usuario
    */
    public String getLogin_usuario(){
        return this.login_usuario;
    }

    /**
    * seta o valor de senha_usuario
    * @param pSenha_usuario
    */
    public void setSenha_usuario(String pSenha_usuario){
        this.senha_usuario = pSenha_usuario;
    }
    /**
    * return senha_usuario
    */
    public String getSenha_usuario(){
        return this.senha_usuario;
    }

    /**
    * seta o valor de situacao_usuario
    * @param pSituacao_usuario
    */
    public void setSituacao_usuario(String pSituacao_usuario){
        this.situacao_usuario = pSituacao_usuario;
    }
    /**
    * return situacao_usuario
    */
    public String getSituacao_usuario(){
        return this.situacao_usuario;
    }

    /**
    * seta o valor de perfil_usuario
    * @param pPerfil_usuario
    */
    public void setPerfil_usuario(int pPerfil_usuario){
        this.perfil_usuario = pPerfil_usuario;
    }
    /**
    * return fk_perfil_usuario
    */
    public int getPerfil_usuario(){
        return this.perfil_usuario;
    }

    @Override
    public String toString(){
        return "ModelUsuario {" + "::id_usuario = " + this.id_usuario + "::nome_usuario = " + this.nome_usuario + "::login_usuario = " + this.login_usuario + "::senha_usuario = " + this.senha_usuario + "::situacao_usuario = " + this.situacao_usuario + "::perfil_usuario = " + this.perfil_usuario +  "}";
    }

    /**
     * @return the nome_perfil
     */
    public String getNome_perfil() {
       return this.nome_perfil;
    }

    /**
     * @param nome_perfil the nome_perfil to set
     */
    public void setNome_perfil(String pnome_perfil) {
        this.nome_perfil = pnome_perfil;
    }

    
}