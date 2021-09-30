import Origen.Persona;
public class Estudiante extends Persona{
    private int nota;
    public Estudiante(){}
    public Estudiante(
        int id, String nombre, String apellido){
            super(id, nombre, apellido);
    }
    public void setNota(int value){
        this.me = "";
        this.nota = value;
    }
    public int getNota(){ return this.nota;}
    public String toString(){
        this.me = super.toString() + " Nota: " 
            + Integer.toString(this.nota);
        return this.me;
    }
}
