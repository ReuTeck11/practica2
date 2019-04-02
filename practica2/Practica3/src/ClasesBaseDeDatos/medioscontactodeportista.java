/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesBaseDeDatos;

/**
 *
 * @author carlo
 */
public class medioscontactodeportista {

    /**
     * @return the medio
     */
    public String getMedio() {
        return medio;
    }

    /**
     * @param medio the medio to set
     */
    public void setMedio(String medio) {
        this.medio = medio;
    }

    /**
     * @return the numeroMedio
     */
    public Integer getNumeroMedio() {
        return numeroMedio;
    }

    /**
     * @param numeroMedio the numeroMedio to set
     */
    public void setNumeroMedio(Integer numeroMedio) {
        this.numeroMedio = numeroMedio;
    }

    /**
     * @return the Deportista_idDeportista
     */
    public Integer getDeportista_idDeportista() {
        return Deportista_idDeportista;
    }

    /**
     * @param Deportista_idDeportista the Deportista_idDeportista to set
     */
    public void setDeportista_idDeportista(Integer Deportista_idDeportista) {
        this.Deportista_idDeportista = Deportista_idDeportista;
    }
    
    private String medio; 
    private Integer numeroMedio;
    private Integer Deportista_idDeportista;
}
