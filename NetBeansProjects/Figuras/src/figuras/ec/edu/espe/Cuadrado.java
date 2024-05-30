
package figuras.ec.edu.espe;

public class Cuadrado extends Figuras{
    
    private float lado;
    
    public float area(){
        return (float) 1.2;
    }
    public float perimetro(){
        return (float) 1.3;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    
    public Cuadrado(float lado, String nombre) {
        super(nombre);
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}'+super.toString();
    }
    
}
