public class Generador implements Generable, Visualizable{
    private int semilla;

    public Generador(){
        this.semilla = 100;
    }

    public Generador(int valorSemilla){
        this.semilla = valorSemilla;
    }

    @Override
    public void ver() {
        System.out.println(this.semilla);
    }

    @Override
    public void generarSeudoAleatorio(int i) {
        // TODO Auto-generated method stub
        this.semilla = ((i * 25173) + 13849) % 65536;
    }

    @Override
    public void generarSeudoAleatorio() {
        // TODO Auto-generated method stub
        this.semilla += ((this.semilla * 25173) + 13849) % 65536;
    }

}
