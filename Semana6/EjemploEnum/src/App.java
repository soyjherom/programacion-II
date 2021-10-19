import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        /*Collection miColeccion;
        Set miSet;
        Set miHashSet = new HashSet(); 
        Set miArbolSet = new TreeSet();
        Set miSetHashEncadenado = new LinkedHashSet<>();
        Map miMapa;*/
        Map miHashMap = new HashMap();
        /*Map miArbolMapa = new TreeMap<>();
        Map miMapaHashEnlazado = new LinkedHashMap<>();
        List miLista;*/
        List miArrayList = new ArrayList<>();
        /*List miListaEnlazada = new LinkedList<>();
        int[] miArreglo = new int[10];*/
    }

    private static void usoEnum(){
        Persona miPersona = new Persona("Maria", Persona.sexo.FEMENINO);
        System.out.println(miPersona.toString());
    }

    private static void definirCalendario(){
        Calendario miCalendario = new Calendario();
        miCalendario.crearActividad("Clase Progra 2", Dia.LUNES);
        miCalendario.verActividad();
    }
}
