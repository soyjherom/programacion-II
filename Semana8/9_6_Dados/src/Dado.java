public class Dado implements Lanzable{
    private int valor = 6;
    public void lanzar(){
        Double valorAleatorio = Math.random()*5+1;
        this.valor = valorAleatorio.intValue();
    }
    public int ver(){ return valor;}
}
