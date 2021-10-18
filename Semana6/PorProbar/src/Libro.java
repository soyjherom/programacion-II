public class Libro {
    private String nombre;
    private String autor;
    private Date fechaPublicacion;
    private String editorial;
    private boolean prestado = false;
    public Libro(final String nombre, final String autor){
        this.nombre = nombre;
        this.autor = autor;
    }
    public void setNombre(final String value){this.nombre = value;}
    public void setAutor(final String value){this.autor = value;}
    public void setEditorial(final String value){this.editorial = value;}
    public void setFechaPublicacion(final Date value){this.fechaPublicacion = value;}
    public void setPrestado(final boolean value){this.prestado = value;}
    public String getNombre(){return this.nombre;}
    public String getAutor(){return this.autor;}
    public String getEditorial(){return this.editorial;}     
    public Date getFechaPublicacion(){return this.fechaPublicacion;}
    public boolean getPrestado(){return this.prestado;}
}
