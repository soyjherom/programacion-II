package Entities;

public class Usuario extends Persona{
    public String rol;
    public String username;
    private String password;
    public Usuario(int id) {
        super(id);
        //TODO Auto-generated constructor stub
    }
    public void setPassword(final String p) 
        throws Exception{
        if(p == null || p.equals("")){
            throw new Exception(
                "El password no puede " 
                + " estar vacio ");
        }
        this.password = p;
    }
    public String getPassword(){
        return this.password;
    }
}
