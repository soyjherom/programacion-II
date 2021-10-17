import java.util.ArrayList;
import java.util.Collection;

public class Caja implements Vaciable{
    private double alto;
    private double ancho;
    private double profundo;
    private double capacidad;
    private boolean llena;
    private boolean abierta;
    private Collection<ObjetoConVolumen> contenido;
    public String color;
    public Caja(
        final double alto, 
        final double ancho, 
        final double profundo){
            this.alto = alto;
            this.ancho = ancho;
            this.profundo = profundo;
            this.capacidad = alto * ancho * profundo;
            this.llena = false;
            this.abierta = true;
            this.contenido = new ArrayList<ObjetoConVolumen>();
    }
    @Override
    public void vaciar() {
        this.contenido.clear();        
    }
}
