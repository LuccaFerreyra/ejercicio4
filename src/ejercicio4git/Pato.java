/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4git;

/**
 *
 * @author ger_m
 */
public class Pato {
    private int alas;
    private boolean vuela;
    private String cojo;

    public Pato() {
    }

    public Pato(int alas, boolean vuela, String cojo) {
        this.alas = alas;
        this.vuela = vuela;
        this.cojo = cojo;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    public String getCojo() {
        return cojo;
    }

    public void setCojo(String cojo) {
        this.cojo = cojo;
    }

    @Override
    public String toString() {
        return "Pato{" + "alas=" + alas + ", vuela=" + vuela + ", cojo=" + cojo + '}';
    }
    
}
