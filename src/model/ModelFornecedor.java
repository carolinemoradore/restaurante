package model;
/**
*
* @author AnaCaroline
*/
public class ModelFornecedor {

    private int id_fornecedor;
    private String nome_fornecedor;
    private String cnpj_fornecedor;
    private String cep_fornecedor;
    private String endereco_fornecedor;
    private String bairro_fornecedor;
    private String cidade_fornecedor;
    private String uf_fornecedor;

    /**
    * Construtor
    */
    public ModelFornecedor(){}

    /**
    * seta o valor de id_fornecedor
    * @param pId_fornecedor
    */
    public void setId_fornecedor(int pId_fornecedor){
        this.id_fornecedor = pId_fornecedor;
    }
    /**
    * return pk_id_fornecedor
    */
    public int getId_fornecedor(){
        return this.id_fornecedor;
    }

    /**
    * seta o valor de nome_fornecedor
    * @param pNome_fornecedor
    */
    public void setNome_fornecedor(String pNome_fornecedor){
        this.nome_fornecedor = pNome_fornecedor;
    }
    /**
    * return nome_fornecedor
    */
    public String getNome_fornecedor(){
        return this.nome_fornecedor;
    }

    /**
    * seta o valor de cnpj_fornecedor
    * @param pCnpj_fornecedor
    */
    public void setCnpj_fornecedor(String pCnpj_fornecedor){
        this.cnpj_fornecedor = pCnpj_fornecedor;
    }
    /**
    * return cnpj_fornecedor
    */
    public String getCnpj_fornecedor(){
        return this.cnpj_fornecedor;
    }

    /**
    * seta o valor de cep_fornecedor
    * @param pCep_fornecedor
    */
    public void setCep_fornecedor(String pCep_fornecedor){
        this.cep_fornecedor = pCep_fornecedor;
    }
    /**
    * return cep_fornecedor
    */
    public String getCep_fornecedor(){
        return this.cep_fornecedor;
    }

    /**
    * seta o valor de endereco_fornecedor
    * @param pEndereco_fornecedor
    */
    public void setEndereco_fornecedor(String pEndereco_fornecedor){
        this.endereco_fornecedor = pEndereco_fornecedor;
    }
    /**
    * return endereco_fornecedor
    */
    public String getEndereco_fornecedor(){
        return this.endereco_fornecedor;
    }

    /**
    * seta o valor de bairro_fornecedor
    * @param pBairro_fornecedor
    */
    public void setBairro_fornecedor(String pBairro_fornecedor){
        this.bairro_fornecedor = pBairro_fornecedor;
    }
    /**
    * return bairro_fornecedor
    */
    public String getBairro_fornecedor(){
        return this.bairro_fornecedor;
    }

    /**
    * seta o valor de cidade_fornecedor
    * @param pCidade_fornecedor
    */
    public void setCidade_fornecedor(String pCidade_fornecedor){
        this.cidade_fornecedor = pCidade_fornecedor;
    }
    /**
    * return cidade_fornecedor
    */
    public String getCidade_fornecedor(){
        return this.cidade_fornecedor;
    }

    /**
    * seta o valor de uf_fornecedor
    * @param pUf_fornecedor
    */
    public void setUf_fornecedor(String pUf_fornecedor){
        this.uf_fornecedor = pUf_fornecedor;
    }
    /**
    * return uf_fornecedor
    */
    public String getUf_fornecedor(){
        return this.uf_fornecedor;
    }

    @Override
    public String toString(){
        return "ModelFornecedor {" + "::id_fornecedor = " + this.id_fornecedor + "::nome_fornecedor = " + this.nome_fornecedor + "::cnpj_fornecedor = " + this.cnpj_fornecedor + "::cep_fornecedor = " + this.cep_fornecedor + "::endereco_fornecedor = " + this.endereco_fornecedor + "::bairro_fornecedor = " + this.bairro_fornecedor + "::cidade_fornecedor = " + this.cidade_fornecedor + "::uf_fornecedor = " + this.uf_fornecedor +  "}";
    }
}