package Origen;
public class Persona {
    private int id;
    public String nombre;
    public String apellido;
    public int edad;
    protected String me;
    public Persona(){}
    public Persona(
        int id, String nombre, String apellido){
            this.id = id;
            this.nombre = nombre;
            this.apellido = apellido;
    }
    public void setId(int id){
        if(this.id <= 0){
            this.id = id;
        }
    }
    @Override
    public String toString(){
        this.me = "ID: " + Integer.toString(this.id);
        this.me += " Nombre: " + this.nombre;
        this.me += " Apellido: " + this.apellido;
        this.me += " Edad: " + Integer.toString(this.edad);
        return this.me;
    }
}
