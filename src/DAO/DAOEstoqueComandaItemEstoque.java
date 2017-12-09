/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelComandaitem;
import model.ModelEstoque;
import model.ModelEstoqueComandaItemEstoque;

/**
 *
 * @author PC
 */
public class DAOEstoqueComandaItemEstoque extends ConexaoMySql {

    public ArrayList<ModelEstoqueComandaItemEstoque> getListaEstoqueComandaItemDAO(int pCodigoVenda) {
        ArrayList<ModelEstoqueComandaItemEstoque> ListaEstoqueComandaItem = new ArrayList<>();
        ModelEstoqueComandaItemEstoque modelEstoqueComandaItemEstoque = new ModelEstoqueComandaItemEstoque();
        ModelEstoque modelestoque = new ModelEstoque();
        ModelComandaitem modelcomandaitem = new ModelComandaitem();
        try {

            this.conectar();
            this.insertSQL("SELECT "
                    + "+tblestoque.id_produto, "
                    + "tblestoque.produto_estoque,"
                    + "tblestoque.qtdeminina_estoque,"
                    + "tblestoque.qtdemaxima_estoque,"
                    + "tblestoque.qtdatual_estoque,"
                    + "tblcomandaitem.id_comandaitem,"
                    + "tblcomandaitem.id_produto,"
                    + "tblcomandaitem.qdte_comandaitem,"
                    + "tblcomandaitem.valortotal_comandaitem,"
                    + "tblcomandaitem.item_comandaitem"
                    + "FROM tblcomadaitem"
                    + "Inner join tblestoque on (produto_comandaitem = id_estoque)"
                    + "WHERE id_comandaitem = '" + pCodigoVenda + "';"
            );
            while (this.getResultSet().next()) {
                modelEstoqueComandaItemEstoque = new ModelEstoqueComandaItemEstoque();
                modelestoque = new ModelEstoque();
                modelcomandaitem = new ModelComandaitem();

                modelestoque.setId_estoque(this.getResultSet().getInt(1));
                modelestoque.setProduto_estoque(this.getResultSet().getInt(2));
                modelestoque.setQtdeminima_estoque(this.getResultSet().getDouble(3));
                modelestoque.setQtdemaxima_estoque(this.getResultSet().getDouble(4));
                modelestoque.setQtdatual_estoque(this.getResultSet().getDouble(5));

                modelcomandaitem.setId_comandaitem(this.getResultSet().getInt(6));
                modelcomandaitem.setId_produto(this.getResultSet().getInt(7));
                modelcomandaitem.setQdte_comandaitem(this.getResultSet().getDouble(8));
                modelcomandaitem.setValortotal_comandaitem(this.getResultSet().getDouble(9));
                modelcomandaitem.setItem_comandaitem(this.getResultSet().getInt(10));

                modelestoque.setModelEstoque(modelestoque);
                modelcomandaitem.setComandaItem(modelcomandaitem);

                ListaEstoqueComandaItem.add(modelEstoqueComandaItemEstoque);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return ListaEstoqueComandaItem;
    }

}
