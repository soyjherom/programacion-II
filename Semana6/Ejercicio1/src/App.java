import java.util.List;
import java.util.ArrayList;
import static java.util.stream.Collectors.toList;

public class App {
    public static void main(String[] args) throws Exception {
        personalizar();
    }
    private static void personalizar(){
        Personaje myPersonaje = new Personaje("Maria");
        
        List<Personaje> personajes = new ArrayList<Personaje>();
        personajes.add(myPersonaje);
        personajes.get(0).getNombre();
        personajes.remove(myPersonaje);

        personajes.add(new Personaje("Jane Doe", Sexo.femenino));
        personajes.add(new Personaje("John Doe", Sexo.masculino));
        personajes.add(new Personaje("Jane White", Sexo.femenino));
        personajes.add(new Personaje("John White", Sexo.masculino));

        personajes.size(); //tamano

        /*
        personajes
            .stream()
            .map(p -> p.sexo)
            .distinct()
            .collect(toList())
            .forEach(s -> System.out.println(s.name()));*/

        personajes
            .stream()
            .map(p -> p.sexo)
            .distinct()
            .collect(toList())
            .forEach(System.out::println);

        personajes.stream().forEach(p -> System.out.println(p.getNombre() + " " + p.sexo.name()));

        personajes.stream().forEach(p ->{
            System.out.println(p.getNombre());
            System.out.println(p.sexo.name());
        });
        
        /*
        for(int i = 0; i < personajes.size(); i++){
            System.out.println(personajes.get(i).getNombre());
        }*/

        /*
        for(Personaje personaje : personajes){
            System.out.println(personaje.getNombre());
        }*/

        
        personajes.stream().forEach(p -> System.out.println(p.getNombre()));

        /*
        personajes
            .stream()
            .filter(p -> p.getNombre().toUpperCase().contains("OH"))
            .forEach(p -> System.out.println(p.getNombre()));
            */
        
            /*
        personajes.stream()
        .filter(p -> p.sexo == Sexo.masculino)
        .forEach(p -> System.out.println(p.getNombre()));
        */
        
        /*
        List<Sexo> sexos = 
            personajes
                .stream()
                .map(p -> p.sexo)
                .distinct()
                .collect(toList());

        sexos.stream().forEach(s -> System.out.println(s.name()));
        */

        
    }
}

