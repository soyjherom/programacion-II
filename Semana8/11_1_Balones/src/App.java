import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Entities.Americano;
import Entities.Billar;
import Entities.Bola;

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
        Bola ocho = new Billar("NEGRA");
        ocho.rodar(15);
        ((Billar)ocho).setNumero(8);

        ((Americano)ovoide).lanzar();

        Americano miOvoide = new Americano("NEGRO");
        miOvoide.lanzar();

        Americano ovoideBlanco = Americano.transformar(ocho);

        List<Bola> lista = new ArrayList<>();
        lista.add(ovoide);
        lista.add(ocho);
        lista.add(miOvoide);
        lista.add(ovoideBlanco);
        
        for(int i = 0; i < lista.size(); i++){
            lista.get(i).ver();
        }
        for(Bola bola : lista){
            bola.ver();
        }
        lista.stream().forEach(bola ->{
            bola.ver();
        });
        lista
            .stream()
            .filter(b -> (b instanceof Billar))
            .map(b -> ((Billar)b).getNumero())
            .collect(Collectors.toList())
            .forEach(numero ->{System.out.println(Integer.toString(numero));});
        
    }
}
