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
public class medioscontactoestudiante {

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
     * @return the Estudiante_idEstudiante
     */
    public Integer getEstudiante_idEstudiante() {
        return Estudiante_idEstudiante;
    }

    /**
     * @param Estudiante_idEstudiante the Estudiante_idEstudiante to set
     */
    public void setEstudiante_idEstudiante(Integer Estudiante_idEstudiante) {
        this.Estudiante_idEstudiante = Estudiante_idEstudiante;
    }
    private String medio; 
    private Integer numeroMedio;
    private Integer Estudiante_idEstudiante;
}
