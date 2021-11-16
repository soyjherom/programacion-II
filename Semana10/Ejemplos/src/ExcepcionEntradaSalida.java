import java.io.IOException;

public class ExcepcionEntradaSalida extends IOException{
    public ExcepcionEntradaSalida(){
        super("Error de entrada o salida.");
    }
}
