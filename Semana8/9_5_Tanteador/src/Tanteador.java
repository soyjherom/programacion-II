public class Tanteador implements Jugable{
    private int puntuacion = 0;
    public void reiniciar(){this.puntuacion = 0;}
    public void aumentar(int puntos){
        this.puntuacion += puntos;
    }
    public void disminuir(int puntos){
        this.puntuacion -= puntos;
    }
    public int ver(){return this.puntuacion;}
}
