public class Rol 
    extends Entidad
    implements Imprimible
{    
    public int getId(){return this.id;}
    public void setId(int valor){
        this.id = valor;
    }
    @Override
    public String imprimir() {
        return "ID: " +
        Integer.toString(this.id) +
        ", ROL: " + this.nombre;
    }
}
