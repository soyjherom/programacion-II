public class Persona {
    private int id = 0;
    public String nombre;
    public String apellido;
    public short edad;

    public void setId(int valor){
        if(id <= 0){
            id = valor;
        }
    }
    
    public int getId(){return id;}

    public void saludar(){
        System
            .out
            .println
            (mensaje());
    }

    protected String imprimir(){
        return "Soy " + nombre;
    }

    private String mensaje(){
        return "Hola me llamo " + nombre
        + " Y mi ID es " + id;
    }
}
