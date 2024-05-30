
package figuras.ec.edu.espe;

public class Figuras {
    private String nombre;

    public Figuras(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Figuras{" + "nombre=" + nombre + '}';
    }
    
    
}
