package Entities;

import Interfaces.Lanzable;

public class Americano extends Bola implements Lanzable{

    public Americano(String color) {
        super(color);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void ver() {
        System.out.println("Posicion " + this.posicion);
        
    }

    public static Americano transformar(Bola bola){
        if(bola instanceof Billar){
            return new Americano(bola.color);   
        }else if(bola instanceof Americano){
            return (Americano)bola;
        }
        return null;
    }

    public String getColor(){return this.color;}

    @Override
    public void lanzar() {
        this.posicion = this.posicion * 3; 
    }
    
}
