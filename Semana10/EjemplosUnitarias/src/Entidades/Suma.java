package Entidades;

import Exceptions.ExcepcionSuma;

public class Suma {
    public int resultado = 0;
    private int sumas;
    public int sumar(final int a)throws ExcepcionSuma{
        if(this.sumas >= 3){
            throw new ExcepcionSuma("Limite de sumas alcanzado");
        }
        if(resultado <= 0){
            this.resultado = a;
        }else{
            this.resultado += a;
        }
        this.sumas++;
        return resultado;
    }

    public int sumar(Object parametro)throws ExcepcionSuma{
        if(parametro instanceof Integer){
            Integer p = (Integer)parametro;
            this.resultado+= p;
            return this.resultado;
        }else{
            throw new ExcepcionSuma("Tipo parametro incorrecto");
        }
    }
}
