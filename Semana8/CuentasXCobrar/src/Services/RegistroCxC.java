package Services;
import Entities.Cliente;
import Entities.Usuario;
import Entities.Roles;
import java.util.List;
import java.util.ArrayList;

public class RegistroCxC {
    private List<Cliente> clientes;
    public RegistroCxC(){
        this.clientes = new ArrayList<>();
    }
    /**
     * Registra una cuenta por cobrar de un cliente
     * @param usuario El usuario que registra la CxC
     * @param cliente El cliente con total adeudado
     * @throws Exception Si el usuario no es Admin
     */
    public void registrar(
        final Usuario usuario, 
        final Cliente cliente) throws Exception{
            if(!usuario.rol.equals(Roles.ADMIN.name())){
                throw new Exception(
                    "Solo los administradores "
                    + "pueden registrar CXC"
                );
            }
            this.registrarCuenta(cliente);
    }
    
    protected void registrarCuenta(Cliente cliente) {
        final Integer indice = existe(cliente);
        if(indice != null){
            this.clientes.get(indice).totalAdeudado = cliente.totalAdeudado;
        }else{
            clientes.add(cliente);
        }
    }
    /**
     * Recorre los clientes y encuentra el indice del cliente buscado
     * @param cliente El cliente buscado
     * @return el indice del cliente buscado o nulo si no encuentra
     */
    private Integer existe(Cliente cliente) {
        for(int i = 0; i<= this.clientes.size(); i++){
            if(this.clientes.get(i).getId() == cliente.getId()){
                return i;
            }
        }
        return null;
    }
}
