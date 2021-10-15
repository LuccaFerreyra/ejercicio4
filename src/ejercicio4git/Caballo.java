
package ejercicio4git;

/**
 *
 * @author Miguel
 */
public class Caballo {
    
    private String raza;
    private String nombre;
    private String sexo;
    private boolean vacunas;
    private String propietario;
    private String color;

    public Caballo() {
    }

    public Caballo(String raza, String nombre, String sexo, boolean vacunas, String propietario, String color) {
        this.raza = raza;
        this.nombre = nombre;
        this.sexo = sexo;
        this.vacunas = vacunas;
        this.propietario = propietario;
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Caballo{" + "raza=" + raza + ", nombre=" + nombre + ", sexo=" + sexo + ", vacunas=" + vacunas + ", propietario=" + propietario + ", color=" + color + '}';
    }
    
    
    
}
