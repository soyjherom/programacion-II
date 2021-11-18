public class Personaje extends Vitalidad{
    private String nombre;
    private Armadura armadura;
    public Sexo sexo;
    public Personaje(String nombre, Sexo sexo){
        super();
        this.nombre = nombre;
        this.sexo = sexo;
    }
    public Personaje(String nombre){
        super();
        this.nombre = nombre;
    }
    public Personaje(
        short valor1, short valor2, 
        short valor3, short valor4) {
        super(valor1, valor2, 
        valor3, valor4);
        //TODO Auto-generated constructor stub
    }
    public Armadura getArmadura() {
        return armadura;
    }
    public void setArmadura(
        Armadura armadura) {
        this.armadura = armadura;
    }
    public String getNombre() {
        return nombre;
    }    
}
