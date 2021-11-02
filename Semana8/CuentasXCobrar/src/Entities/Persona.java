package Entities;
public abstract class Persona{
    private int id = 0;
    public String nombre;
    public String apellido;
    public int edad;
    public Persona(int id, String nombre, String apellido){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Persona(int id){
        this.id = id;
    }
    public int getId(){return this.id;}
}