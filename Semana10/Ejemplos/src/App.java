import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws Exception {
        ExcepcionEntradaSalida excepcion = new ExcepcionEntradaSalida();
        System.out.println(excepcion.getMessage());
    }
    private static void ejemplificacion() throws Exception{
        Exception myException = new Exception("Exception");
        throw myException;
    }
}
