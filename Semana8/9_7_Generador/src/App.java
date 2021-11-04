/*
9.7 Generador de números aleatorios Escriba su propio generador de números aleatorios 
como una clase que utilice una fórmula para obtener el siguiente número seudo-alea-torio a 
partir del anterior. Un programa de números aleatorios funciona empezando con un valor de "semilla".

Después de eso, el número aleatorio actual se utiliza como base para el siguiente, 
realizando ciertos cálculos sobre él para convertirlo en algún otro número (aparentemente aleatorio). 
Una buena fórmula para utilizar con los enteros es:

r = ((r * 25173) + 13849) % 65536;

la cual produce números en el rango de 0 a 65535. Los números específicos en esta fórmula han demostrado 
obtener buenos resultados.


Criterio	Cumple	No cumple
Compila		
Corre		
Cumple con los requerimientos		
Abarca el concepto de abstracción (usa clases)		
Abarca el concepto de Encapsulamiento		
Abarca el concepto de Herencia		
Usa una correcta identación del código
*/

public class App {
    public static void main(String[] args) throws Exception {
        Generador generador = new Generador(5);
        generador.generarSeudoAleatorio();
        generador.ver();
        generador.generarSeudoAleatorio(200);
        generador.ver();
    }
}
