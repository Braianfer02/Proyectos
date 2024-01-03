
package Logic;

public class Cine {
    private String Nombre;
    private String Descripcion;
    private String Genero;
    
    public Cine(String Nombre, String Descripcion, String Genero){
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Genero = Genero;
    }
    
    @Override
    public String toString(){
        return "Nombre de la pelicula: " + this.Nombre + "\nGeneros: " + this.Genero + "\nBreve descripcion: " + this.Descripcion;
    }
}
