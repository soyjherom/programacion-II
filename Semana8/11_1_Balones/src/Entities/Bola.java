package Entities;

import Interfaces.Rodable;
import Interfaces.Visible;

public abstract class Bola implements Rodable, Visible{
    protected int posicion = 0;
    protected String color;
    public Bola(String color){
        this.color = color;
    }
    @Override
    public void rodar(int distancia) {
        // TODO Auto-generated method stub
        this.posicion += distancia;
    }
    public void ver(){
        String hola = "";
    }
}
