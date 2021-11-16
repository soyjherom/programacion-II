package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import Entidades.Suma;
import Exceptions.ExcepcionCalculadora;
import Exceptions.ExcepcionSuma;

public class TestSuma {
    @Test
    public void testSuma(){
        Suma suma = new Suma();
        try{
            int resultado = suma.sumar(1);
            resultado = suma.sumar(2);
            resultado = suma.sumar(3);
            resultado = suma.sumar(4);
            assertTrue(false);
        }catch(ExcepcionSuma ex){
            final String mensaje = ex.getMessage();
            assertEquals("Limite de sumas alcanzado", mensaje);
        }
    }

    @Test(expected = ExcepcionSuma.class)
    public void testSuma2() throws Exception{
        Suma suma = new Suma();
        int resultado = suma.sumar(1);
        resultado = suma.sumar(2);
        resultado = suma.sumar(3);
        resultado = suma.sumar(4);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testSuma3() throws Exception{
        thrown.expect(ExcepcionSuma.class);
        Suma suma = new Suma();
        int resultado = suma.sumar(1);
        resultado = suma.sumar(2);
        resultado = suma.sumar(3);
        resultado = suma.sumar(4);
    }

    @Test()
    public void testSuma4() throws Exception{
        Suma suma = new Suma();
        Object p = 3;
        int resultado = suma.sumar(p);
        assertEquals(3, resultado);
    }

    @Test(expected = ExcepcionSuma.class)
    public void testSuma5() throws Exception{
        Suma suma = new Suma();
        Object p = "Hola";
        int resultado = suma.sumar(p);
        assertEquals(3, resultado);
    }

    @Test(expected = ExcepcionSuma.class)
    public void testSuma6() throws Exception{
        Suma suma = new Suma();
        Object p = 1.0d;
        int resultado = suma.sumar(p);
        assertEquals(3, resultado);
    }
}
