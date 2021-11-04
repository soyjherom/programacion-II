/*
9.6 Dados Diseñe y escriba una clase que actúe como un dado, 
que puede tirar para obtener un valor de 1 a 6. Inicialmente escríbala de forma que siempre de el valor 6. 
Escriba una clase que cree un objeto dado y lo utilice. 
La pantalla debe mostrar un botón que, al ser oprimido, ocasione que se tire el dado y se muestre su 
valor en pantalla.

Después altere el dado de manera que de el valor de un número más alto del que se tiró la última vez, 
por ejemplo, 4 cuando la última vez cayó un 3.

Luego altérelo de manera que utilice el generador de números aleatorios de la biblioteca. 
Algunos juegos como el backgammon y Monopoly necesitan dos dados. Escriba instrucciones en Java para 
crear dos instancias del objeto dado, tirarlos y mostrar en pantalla los resultados.


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
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();
        dado1.lanzar();
        System.out.println(Integer.toString(dado1.ver()));
        dado2.lanzar();
        System.out.println(Integer.toString(dado2.ver()));
    }
}
