/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author CaroleCristhian
 */
public class ModelComandaCliente {
    
    private ModelCliente modelCliente;
    private ModelComanda modelComanda;
    private ArrayList<ModelComandaCliente> lisaModelComandaCliente;

    /**
     * @return the modelCliente
     */
    public ModelCliente getModelCliente() {
        return modelCliente;
    }

    /**
     * @param modelCliente the modelCliente to set
     */
    public void setModelCliente(ModelCliente modelCliente) {
        this.modelCliente = modelCliente;
    }

    /**
     * @return the modelComanda
     */
    public ModelComanda getModelComanda() {
        return modelComanda;
    }

    /**
     * @param modelComanda the modelComanda to set
     */
    public void setModelComanda(ModelComanda modelComanda) {
        this.modelComanda = modelComanda;
    }

    /**
     * @return the lisaModelComandaCliente
     */
    public ArrayList<ModelComandaCliente> getLisaModelComandaCliente() {
        return lisaModelComandaCliente;
    }

    /**
     * @param lisaModelComandaCliente the lisaModelComandaCliente to set
     */
    public void setLisaModelComandaCliente(ArrayList<ModelComandaCliente> lisaModelComandaCliente) {
        this.lisaModelComandaCliente = lisaModelComandaCliente;
    }
}
