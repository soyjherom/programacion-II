package Exceptions;

public class ExcepcionSuma extends Exception{
    public ExcepcionSuma(){
        super("Excepcion sumando numeros");
    }
    public ExcepcionSuma(final String mensaje){
        super(mensaje);
    }
}