package model;
/**
*
* @author AnaCaroline
*/
public class ModelEstoque {

    private int id_estoque;
    private int produto_estoque;
    private String descricao_produto;
    private Double Preco_produto;
    private Double qtdeminima_estoque;
    private Double qtdemaxima_estoque;
    private Double qtdatual_estoque;

    /**
    * Construtor
    */
    public ModelEstoque(){}

    /**
    * seta o valor de id_estoque
    * @param pId_estoque
    */
    public void setId_estoque(int pId_estoque){
        this.id_estoque = pId_estoque;
    }
    /**
    * return pk_id_estoque
    */
    public int getId_estoque(){
        return this.id_estoque;
    }

    /**
    * seta o valor de produto_estoque
    * @param pProduto_estoque
    */
    public void setProduto_estoque(int pProduto_estoque){
        this.produto_estoque = pProduto_estoque;
    }
    /**
    * return produto_estoque
    */
    public int getProduto_estoque(){
        return this.produto_estoque;
    }

    /**
    * seta o valor de qtdeminima_estoque
    * @param pQtdeminima_estoque
    */
    public void setQtdeminima_estoque(Double pQtdeminima_estoque){
        this.qtdeminima_estoque = pQtdeminima_estoque;
    }
    /**
    * return qtdeminima_estoque
    */
    public Double getQtdeminima_estoque(){
        return this.qtdeminima_estoque;
    }

    /**
    * seta o valor de qtdemaxima_estoque
    * @param pQtdemaxima_estoque
    */
    public void setQtdemaxima_estoque(Double pQtdemaxima_estoque){
        this.qtdemaxima_estoque = pQtdemaxima_estoque;
    }
    /**
    * return qtdemaxima_estoque
    */
    public Double getQtdemaxima_estoque(){
        return this.qtdemaxima_estoque;
    }

    /**
    * seta o valor de qtdatual_estoque
    * @param pQtdatual_estoque
    */
    public void setQtdatual_estoque(Double pQtdatual_estoque){
        this.qtdatual_estoque = pQtdatual_estoque;
    }
    /**
    * return qtdatual_estoque
    */
    public Double getQtdatual_estoque(){
        return this.qtdatual_estoque;
    }

    @Override
    public String toString(){
        return "ModelEstoque {" + "::id_estoque = " + this.id_estoque + "::produto_estoque = " + this.produto_estoque + "::qtdeminima_estoque = " + this.qtdeminima_estoque + "::qtdemaxima_estoque = " + this.qtdemaxima_estoque + "::qtdatual_estoque = " + this.qtdatual_estoque +  "}";
    }

    /**
     * @return the descricao_produto
     */
    public String getDescricao_produto() {
        return descricao_produto;
    }

    /**
     * @param descricao_produto the descricao_produto to set
     */
    public void setDescricao_produto(String descricao_produto) {
        this.descricao_produto = descricao_produto;
    }

    /**
     * @return the Preco_produto
     */
    public Double getPreco_produto() {
        return Preco_produto;
    }

    /**
     * @param Preco_produto the Preco_produto to set
     */
    public void setPreco_produto(Double Preco_produto) {
        this.Preco_produto = Preco_produto;
    }

    public void setModelEstoque(ModelEstoque modelestoque) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}