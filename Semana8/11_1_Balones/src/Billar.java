public class Billar extends Bola{
    private int numero = 0;
    public Billar(String color){
        super(color);
        if(this.color.equalsIgnoreCase("blanco")){
            this.numero = 0;
        }
    }
    public void setNumero(int n){
        if(!this.color.equalsIgnoreCase("blanco")){
            this.numero = n;
        }
    };
    public void ver(){
        System.out.println("Color " + this.color);
        if(!this.color.equalsIgnoreCase("blanco")){
            System.out.println("Numero " + Integer.toString(this.numero));
        }
    }
}
