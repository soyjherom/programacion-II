public class Armadura  extends Vitalidad{
    private Material material;
    public String color;
    public Armadura(
        short valor1, short valor2, 
        short valor3, short valor4) {
        super(valor1, valor2, 
        valor3, valor4);
        //TODO Auto-generated constructor stub
    }
    public Armadura(
        short valor1, short valor2, 
        short valor3, short valor4,
        Material valor5) {
        super(valor1, valor2, 
        valor3, valor4);
        //TODO Auto-generated constructor stub
    }
    public Material getMaterial(){
        return this.material;
    }
}
