
package ejercicio4git;




public class Pajaro {
    
    private String nombre;
    private String color;
    private String alimento;
    private String sexo;

    public Pajaro() {
    }

    public Pajaro(String nombre, String color, String alimento, String sexo) {
        this.nombre = nombre;
        this.color = color;
        this.alimento = alimento;
        this.sexo = sexo;
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

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pajaro{" + "nombre=" + nombre + ", color=" + color + ", alimento=" + alimento + ", sexo=" + sexo + '}';
    }
    
    
    
}


