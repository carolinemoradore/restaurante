package model;
/**
*
* @author AnaCaroline
*/
public class ModelComandaitem {

    private int id_comandaitem;
    private int id_produto;
    private Double qdte_comandaitem;
    private Double valortotal_comandaitem;
    private int item_comandaitem;

    /**
    * Construtor
    */
    public ModelComandaitem(){}

    /**
    * seta o valor de id_comandaitem
    * @param pId_comandaitem
    */
    public void setId_comandaitem(int pId_comandaitem){
        this.id_comandaitem = pId_comandaitem;
    }
    /**
    * return pk_id_comandaitem
    */
    public int getId_comandaitem(){
        return this.id_comandaitem;
    }

    /**
    * seta o valor de id_produto
    * @param pId_produto
    */
    public void setId_produto(int pId_produto){
        this.id_produto = pId_produto;
    }
    /**
    * return id_produto
    */
    public int getId_produto(){
        return this.id_produto;
    }

    /**
    * seta o valor de qdte_comandaitem
    * @param pQdte_comandaitem
    */
    public void setQdte_comandaitem(Double pQdte_comandaitem){
        this.qdte_comandaitem = pQdte_comandaitem;
    }
    /**
    * return qdte_comandaitem
    */
    public Double getQdte_comandaitem(){
        return this.qdte_comandaitem;
    }

    /**
    * seta o valor de valortotal_comandaitem
    * @param pValortotal_comandaitem
    */
    public void setValortotal_comandaitem(Double pValortotal_comandaitem){
        this.valortotal_comandaitem = pValortotal_comandaitem;
    }
    /**
    * return valortotal_comandaitem
    */
    public Double getValortotal_comandaitem(){
        return this.valortotal_comandaitem;
    }

    /**
    * seta o valor de item_comandaitem
    * @param pItem_comandaitem
    */
    public void setItem_comandaitem(int pItem_comandaitem){
        this.item_comandaitem = pItem_comandaitem;
    }
    /**
    * return item_comandaitem
    */
    public int getItem_comandaitem(){
        return this.item_comandaitem;
    }

    @Override
    public String toString(){
        return "ModelComandaitem {" + "::id_comandaitem = " + this.id_comandaitem + "::id_produto = " + this.id_produto + "::qdte_comandaitem = " + this.qdte_comandaitem + "::valortotal_comandaitem = " + this.valortotal_comandaitem + "::item_comandaitem = " + this.item_comandaitem +  "}";
    }

    public void setComandaItem(ModelComandaitem modelcomandaitem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}