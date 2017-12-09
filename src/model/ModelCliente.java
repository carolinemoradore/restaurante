package model;
/**
*
* @author AnaCaroline
*/
public class ModelCliente {

    private int id_cliente;
    private String nome_cliente;
    private String cpf_cliente;
    private String cep_cliente;
    private String endereco_cliente;
    private String bairro_cliente;
    private String uf_cliente;
    private String sexo_cliente;
    private String estadocivil_cliente;
    private int promocoes_cliente;
    private String cidade_cliente;

    /**
    * Construtor
    */
    public ModelCliente(){}

    /**
    * seta o valor de id_cliente
    * @param pId_cliente
    */
    public void setId_cliente(int pId_cliente){
        this.id_cliente = pId_cliente;
    }
    /**
    * return pk_id_cliente
    */
    public int getId_cliente(){
        return this.id_cliente;
    }

    /**
    * seta o valor de nome_cliente
    * @param pNome_cliente
    */
    public void setNome_cliente(String pNome_cliente){
        this.nome_cliente = pNome_cliente;
    }
    /**
    * return nome_cliente
    */
    public String getNome_cliente(){
        return this.nome_cliente;
    }

    /**
    * seta o valor de cpf_cliente
    * @param pCpf_cliente
    */
    public void setCpf_cliente(String pCpf_cliente){
        this.cpf_cliente = pCpf_cliente;
    }
    /**
    * return cpf_cliente
    */
    public String getCpf_cliente(){
        return this.cpf_cliente;
    }

    /**
    * seta o valor de cep_cliente
    * @param pCep_cliente
    */
    public void setCep_cliente(String pCep_cliente){
        this.cep_cliente = pCep_cliente;
    }
    /**
    * return cep_cliente
    */
    public String getCep_cliente(){
        return this.cep_cliente;
    }

    /**
    * seta o valor de endereco_cliente
    * @param pEndereco_cliente
    */
    public void setEndereco_cliente(String pEndereco_cliente){
        this.endereco_cliente = pEndereco_cliente;
    }
    /**
    * return endereco_cliente
    */
    public String getEndereco_cliente(){
        return this.endereco_cliente;
    }

    /**
    * seta o valor de bairro_cliente
    * @param pBairro_cliente
    */
    public void setBairro_cliente(String pBairro_cliente){
        this.bairro_cliente = pBairro_cliente;
    }
    /**
    * return bairro_cliente
    */
    public String getBairro_cliente(){
        return this.bairro_cliente;
    }

    /**
    * seta o valor de uf_cliente
    * @param pUf_cliente
    */
    public void setUf_cliente(String pUf_cliente){
        this.uf_cliente = pUf_cliente;
    }
    /**
    * return uf_cliente
    */
    public String getUf_cliente(){
        return this.uf_cliente;
    }

    /**
    * seta o valor de sexo_cliente
    * @param pSexo_cliente
    */
    public void setSexo_cliente(String pSexo_cliente){
        this.sexo_cliente = pSexo_cliente;
    }
    /**
    * return sexo_cliente
    */
    public String getSexo_cliente(){
        return this.sexo_cliente;
    }

    /**
    * seta o valor de estadocivil_cliente
    * @param pEstadocivil_cliente
    */
    public void setEstadocivil_cliente(String pEstadocivil_cliente){
        this.estadocivil_cliente = pEstadocivil_cliente;
    }
    /**
    * return estadocivil_cliente
    */
    public String getEstadocivil_cliente(){
        return this.estadocivil_cliente;
    }

    /**
    * seta o valor de promocoes_cliente
    * @param pPromocoes_cliente
    */
    public void setPromocoes_cliente(int pPromocoes_cliente){
        this.promocoes_cliente = pPromocoes_cliente;
    }
    /**
    * return promocoes_cliente
    */
    public int getPromocoes_cliente(){
        return this.promocoes_cliente;
    }

    /**
    * seta o valor de cidade_cliente
    * @param pCidade_cliente
    */
    public void setCidade_cliente(String pCidade_cliente){
        this.cidade_cliente = pCidade_cliente;
    }
    /**
    * return cidade_cliente
    */
    public String getCidade_cliente(){
        return this.cidade_cliente;
    }

    @Override
    public String toString(){
        return "ModelCliente {" + "::id_cliente = " + this.id_cliente + "::nome_cliente = " + this.nome_cliente + "::cpf_cliente = " + this.cpf_cliente + "::cep_cliente = " + this.cep_cliente + "::endereco_cliente = " + this.endereco_cliente + "::bairro_cliente = " + this.bairro_cliente + "::uf_cliente = " + this.uf_cliente + "::sexo_cliente = " + this.sexo_cliente + "::estadocivil_cliente = " + this.estadocivil_cliente + "::promocoes_cliente = " + this.promocoes_cliente + "::cidade_cliente = " + this.cidade_cliente +  "}";
    }
}