/*
11.1 Balones de fútbol americano Escriba una clase llamada Balon Americano que describa a un balón de 
fútbol americano. Este tipo de balón es ovalado pero, aparte de eso, se comporta exactamente igual que 
un objeto BolaBillar. Utilice al máximo el proceso de extender las clases que se muestran en el texto.

Dibuje un diagrama de jerarquía de clases para mostrar la relación existente entre las distintas clases.

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

    //EJEMPLO DE USO DEL POLIMORFISMO
    public static void main(String[] args) throws Exception {
        Bola ovoide = new Americano("cafe");
        ovoide.rodar(100);
        Bola ocho = new Billar("BLANCO");
        ocho.rodar(15);
        ((Billar)ocho).setNumero(8);
        ovoide.ver();
        ocho.ver();
    }
}
