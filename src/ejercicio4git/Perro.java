/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4git;


public class Perro {
   
    private String nombre;
    private String color;        
    private Integer edad;       
    private Boolean cola;

    public Perro() {
    }

    public Perro(String nombre, String color, Integer edad, Boolean cola) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Boolean getCola() {
        return cola;
    }

    public void setCola(Boolean cola) {
        this.cola = cola;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", color=" + color + ", edad=" + edad + ", cola=" + cola + '}';
    }  
}
