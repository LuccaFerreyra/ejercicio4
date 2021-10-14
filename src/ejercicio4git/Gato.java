/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4git;

/**
 *
 * @author macah
 */
public class Gato {
    
    private String pelaje;
    private String color;
    private String sexo;
    private boolean vacunas;

    public Gato(String pelaje, String color, String sexo, boolean vacunas) {
        this.pelaje = pelaje;
        this.color = color;
        this.sexo = sexo;
        this.vacunas = vacunas;
    }

    public Gato() {
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean isVacunas() {
        return vacunas;
    }

    public void setVacunas(boolean vacunas) {
        this.vacunas = vacunas;
    }

    @Override
    public String toString() {
        return "Gato{" + "pelaje=" + pelaje + ", color=" + color + ", sexo=" + sexo + ", vacunas=" + vacunas + '}';
    }
    
    
}
