public class Actividad {
    private Dia dia;
    private String nombre;
    public Actividad(Dia diaSeleccionado, String nombre){
        this.setDia(diaSeleccionado);
        this.setNombre(nombre);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Dia getDia() {
        return dia;
    }
    public void setDia(Dia dia) {
        this.dia = dia;
    }
}
