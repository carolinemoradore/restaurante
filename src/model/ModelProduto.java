package model;
/**
*
* @author AnaCaroline
*/
public class ModelProduto {

    private int id_produto;
    private String descricao_produto;
    private String unidade_produto;
    private String nome_fornecedor;
    private Double preco_produto;
    private int fornecedor_produto;

    /**
    * Construtor
    */
    public ModelProduto(){}

    /**
    * seta o valor de id_produto
    * @param pId_produto
    */
    public void setId_produto(int pId_produto){
        this.id_produto = pId_produto;
    }
    /**
    * return pk_id_produto
    */
    public int getId_produto(){
        return this.id_produto;
    }

    /**
    * seta o valor de descricao_produto
    * @param pDescricao_produto
    */
    public void setDescricao_produto(String pDescricao_produto){
        this.descricao_produto = pDescricao_produto;
    }
    /**
    * return descricao_produto
    */
    public String getDescricao_produto(){
        return this.descricao_produto;
    }

    /**
    * seta o valor de unidade_produto
    * @param pUnidade_produto
    */
    public void setUnidade_produto(String pUnidade_produto){
        this.unidade_produto = pUnidade_produto;
    }
    /**
    * return unidade_produto
    */
    public String getUnidade_produto(){
        return this.unidade_produto;
    }

    /**
    * seta o valor de preco_produto
    * @param pPreco_produto
    */
    public void setPreco_produto(Double pPreco_produto){
        this.preco_produto = pPreco_produto;
    }
    /**
    * return preco_produto
    */
    public Double getPreco_produto(){
        return this.preco_produto;
    }

    /**
    * seta o valor de fornecedor_produto
    * @param pFornecedor_produto
    */
    public void setFornecedor_produto(int pFornecedor_produto){
        this.fornecedor_produto = pFornecedor_produto;
    }
    /**
    * return fk_fornecedor_produto
    */
    public int getFornecedor_produto(){
        return this.fornecedor_produto;
    }

    @Override
    public String toString(){
        return "ModelProduto {" + "::id_produto = " + this.id_produto + "::descricao_produto = " + this.descricao_produto + "::unidade_produto = " + this.unidade_produto + "::preco_produto = " + this.preco_produto + "::fornecedor_produto = " + this.fornecedor_produto +  "}";
    }

    /**
     * @return the nome_fornecedor
     */
    public String getNome_fornecedor() {
        return nome_fornecedor;
    }

    /**
     * @param nome_fornecedor the nome_fornecedor to set
     */
    public void setNome_fornecedor(String nome_fornecedor) {
        this.nome_fornecedor = nome_fornecedor;
    }
}