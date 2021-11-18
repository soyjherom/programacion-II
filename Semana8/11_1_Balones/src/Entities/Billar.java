package Entities;
import Interfaces.Rebotable;
public class Billar extends Bola implements Rebotable{
    private int numero = 0;
    public Billar(String color){
        super(color);
        if(this.color.equalsIgnoreCase("blanco")){
            this.numero = 0;
        }
    }
    public int getNumero(){return this.numero;}
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
    @Override
    public void rebotar() {
        this.posicion = this.posicion + 44;
        
    }
}
