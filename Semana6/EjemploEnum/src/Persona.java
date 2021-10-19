public class Persona {
    public enum sexo{
        MASCULINO,
        FEMENINO
    }
    private sexo sexoBiologico;
    private String nombre;
    public Persona(){
        this.setNombre("John Doe");
        this.setSexoBiologico(sexo.MASCULINO);
    }
    public sexo getSexoBiologico() {
        return sexoBiologico;
    }
    public void setSexoBiologico(sexo sexoBiologico) {
        this.sexoBiologico = sexoBiologico;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Persona(String nombre, sexo sexoDeterminado){
        this.setNombre(nombre);
        this.setSexoBiologico(sexoDeterminado);
    } 
    public String toString(){
        return 
            "Hola soy " + 
            this.nombre + 
            " Y tengo un sexo biologico " + 
            this.sexoBiologico.toString();
    }
}
