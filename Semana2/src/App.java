public class App {
    public static void main(String[] args) throws Exception {
        int var = 1;
        Estudiante estudiante = new Estudiante();
        estudiante.setId(1);
        estudiante.nombre = "John";
        estudiante.apellido = "Doe";
        estudiante.nota = 100.00d;
        estudiante.edad = 25;
        estudiante.setId(2);
        estudiante.saludar();

        Persona persona = new Persona();
        persona.setId(3);

        verIdPersona(persona);
        verIdPersona(estudiante);
    }

    static void verIdPersona(Persona persona){
       System.out.println(persona.getId()); 
       if(persona instanceof Estudiante){
        System.out.println(((Estudiante)persona).nota);
       }
    }
}
