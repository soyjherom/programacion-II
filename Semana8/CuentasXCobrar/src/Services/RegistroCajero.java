package Services;
import Entities.Cliente;
import Entities.Roles;
import Entities.Usuario;

public class RegistroCajero extends RegistroCxC{

    @Override
    public void registrar(
        final Usuario usuario, 
        final Cliente cliente) throws Exception{
        if(usuario.rol.equalsIgnoreCase(Roles.CAJERO.name()) &&
            cliente.rol.equalsIgnoreCase(Roles.ASOCIADO.name())){
                this.registrarCuenta(cliente);
        }else{
            throw new Exception("Los cajeros solo pueden registrar "
            + "cuentas por cobrar de asociados ");
        }
    }
    
}
