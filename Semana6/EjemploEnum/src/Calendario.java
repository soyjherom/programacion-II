import java.util.Collection;

public class Calendario{
    private Actividad actividad;
    private int contador = 0;
    public Calendario(){}
    public Calendario(Actividad actividad){
        this.actividad = actividad;
    }
    public void crearActividad(
        final String nombre, 
        final Dia diaSeleccionado){
            if(this.actividad == null){
                this.actividad = new 
                    Actividad(diaSeleccionado, nombre);
            }else{
                if(this.actividad.getDia().equals(diaSeleccionado)){
                    System.out.println("Por favor seleccione otro dia");
                }
                this.actividad.setNombre(nombre);
                this.actividad.setDia(diaSeleccionado);
            }
            this.contador = Calculadora.sumar(this.contador, 1); 
    }
    public void verActividad(){
        if(this.actividad == null)
            return;
        switch(this.actividad.getDia()){
            case LUNES:
                this.decirQueHaremos(Dia.LUNES.toString(), this.actividad.getNombre());
                break;
            case MARTES:
                this.decirQueHaremos(Dia.MARTES.toString(), this.actividad.getNombre());
                break;
            case MIERCOLES:
                this.decirQueHaremos(Dia.MIERCOLES.toString(), this.actividad.getNombre());
                break;
            case JUEVES:
                this.decirQueHaremos(Dia.JUEVES.toString(), this.actividad.getNombre());
                break;
            case VIERNES:
                this.decirQueHaremos(Dia.VIERNES.toString(), this.actividad.getNombre());
                break;
            case SABADO:
                this.decirQueHaremos(Dia.SABADO.toString(), this.actividad.getNombre());
                break;
            default:
                this.decirQueHaremos(Dia.DOMINGO.toString(), this.actividad.getNombre());
                break;

        }
    }
    private void decirQueHaremos(String dia, String actividad) {
        System.out.printf("El dia "+dia+" haremos " + actividad);
    }
}