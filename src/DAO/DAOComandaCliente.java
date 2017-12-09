/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelCliente;
import model.ModelComanda;
import model.ModelComandaCliente;

/**
 *
 * @author CaroleCristhian
 */
public class DAOComandaCliente extends ConexaoMySql{
    
    public ArrayList<ModelComandaCliente> getListaComandaClienteDAO(){
        ArrayList<ModelComandaCliente> listamodelComandaCliente = new ArrayList();
        ModelComanda modelComanda = new ModelComanda();
        ModelCliente modelCliente = new ModelCliente();
        ModelComandaCliente modelComandaCliente = new ModelComandaCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_comanda,"
                    + "cliente_comanda,"
                    + "data_comanda,"
                    + "bruto_comanda,"
                    + "desconto_comanda,"
                    + "liquido_comanda,"
                    + "id_cliente,"
                    + "nome_cliente,"
                    + "cpf_cliente,"
                    + "cep_cliente,"
                    + "endereco_cliente,"
                    + "bairro_cliente,"
                    + "uf_cliente,"
                    + "sexo_cliente,"
                    + "estadocivil_cliente,"
                    + "promocoes_cliente,"
                    + "cidade_cliente"
                 + " FROM"
                     + " tblcomanda"
                     + " inner join tblcliente on (cliente_comanda = id_cliente)"
                + ";"
            );

            while(this.getResultSet().next()){
                modelComanda = new ModelComanda();
                modelCliente = new ModelCliente();
                modelComandaCliente = new ModelComandaCliente();
                modelComanda.setId_comanda(this.getResultSet().getInt(1));
                modelComanda.setCliente_comanda(this.getResultSet().getInt(2));
                modelComanda.setData_comanda(this.getResultSet().getDate(3));
                modelComanda.setBruto_comanda(this.getResultSet().getDouble(4));
                modelComanda.setDesconto_comanda(this.getResultSet().getDouble(5));
                modelComanda.setLiquido_comanda(this.getResultSet().getDouble(6));
                
                modelCliente.setId_cliente(this.getResultSet().getInt(7));
                modelCliente.setNome_cliente(this.getResultSet().getString(8));
                modelCliente.setCpf_cliente(this.getResultSet().getString(9));
                modelCliente.setCep_cliente(this.getResultSet().getString(10));
                modelCliente.setEndereco_cliente(this.getResultSet().getString(11));
                modelCliente.setBairro_cliente(this.getResultSet().getString(12));
                modelCliente.setUf_cliente(this.getResultSet().getString(13));
                modelCliente.setSexo_cliente(this.getResultSet().getString(14));
                modelCliente.setEstadocivil_cliente(this.getResultSet().getString(15));
                modelCliente.setPromocoes_cliente(this.getResultSet().getInt(16));
                modelCliente.setCidade_cliente(this.getResultSet().getString(17));
                modelComandaCliente.setModelComanda(modelComanda);
                modelComandaCliente.setModelCliente(modelCliente);
                listamodelComandaCliente.add(modelComandaCliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelComandaCliente;
    }
    
}
