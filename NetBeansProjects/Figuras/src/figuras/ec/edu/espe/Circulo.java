
package figuras.ec.edu.espe;

public class Circulo extends Figuras{
    private float radio;
    
    public float area(){
        return (float) 1.2;
    }
    public float perimetro(){
        return (float) 1.3;
    }
    
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    public Circulo(float radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }
    
    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}'+super.toString();
    }    
}
