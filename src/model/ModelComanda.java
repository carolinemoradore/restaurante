package model;

import java.sql.Date;

/**
*
* @author AnaCaroline
*/
public class ModelComanda {

    private int id_comanda;
    private int cliente_comanda;
    private Date data_comanda;
    private Double bruto_comanda;
    private Double desconto_comanda;
    private Double liquido_comanda;

    /**
    * Construtor
    */
    public ModelComanda(){}

    /**
    * seta o valor de id_comanda
    * @param pId_comanda
    */
    public void setId_comanda(int pId_comanda){
        this.id_comanda = pId_comanda;
    }
    /**
    * return id_comanda
    */
    public int getId_comanda(){
        return this.id_comanda;
    }

    /**
    * seta o valor de cliente_comanda
    * @param pCliente_comanda
    */
    public void setCliente_comanda(int pCliente_comanda){
        this.cliente_comanda = pCliente_comanda;
    }
    /**
    * return cliente_comanda
    */
    public int getCliente_comanda(){
        return this.cliente_comanda;
    }

    /**
    * seta o valor de data_comanda
    * @param pData_comanda
    */
    public void setData_comanda(Date pData_comanda){
        this.data_comanda = pData_comanda;
    }
    /**
    * return data_comanda
    */
    public Date getData_comanda(){
        return this.data_comanda;
    }

    /**
    * seta o valor de bruto_comanda
    * @param pBruto_comanda
    */
    public void setBruto_comanda(Double pBruto_comanda){
        this.bruto_comanda = pBruto_comanda;
    }
    /**
    * return bruto_comanda
    */
    public Double getBruto_comanda(){
        return this.bruto_comanda;
    }

    /**
    * seta o valor de desconto_comanda
    * @param pDesconto_comanda
    */
    public void setDesconto_comanda(Double pDesconto_comanda){
        this.desconto_comanda = pDesconto_comanda;
    }
    /**
    * return desconto_comanda
    */
    public Double getDesconto_comanda(){
        return this.desconto_comanda;
    }

    /**
    * seta o valor de liquido_comanda
    * @param pLiquido_comanda
    */
    public void setLiquido_comanda(Double pLiquido_comanda){
        this.liquido_comanda = pLiquido_comanda;
    }
    /**
    * return liquido_comanda
    */
    public Double getLiquido_comanda(){
        return this.liquido_comanda;
    }

    @Override
    public String toString(){
        return "ModelComanda {" + "::id_comanda = " + this.id_comanda + "::cliente_comanda = " + this.cliente_comanda + "::data_comanda = " + this.data_comanda + "::bruto_comanda = " + this.bruto_comanda + "::desconto_comanda = " + this.desconto_comanda + "::liquido_comanda = " + this.liquido_comanda +  "}";
    }
}