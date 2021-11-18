package Servicios;
import Entidades.Libro;

public class Libreria {
    public void prestar(Libro ejemplar) throws Exception{
        if(ejemplar.getPrestado())
            throw new Exception("El libro no se puede prestar porque esta prestado");
        ejemplar.setPrestado(true);
    }

    public void devolver(Libro ejemplar) throws Exception{
        if(!ejemplar.getPrestado())
            throw new Exception("No puede devolverse un libro que aun no ha prestado");
        ejemplar.setPrestado(false);
    }
}
