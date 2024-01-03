
package braian.fernandez.fittergym.logic;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class productos implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idProducto;
    @Basic
    private int precio;
    private String nombre;

    public productos() {
    }

    public productos(int idProducto, int precio, String nombre) {
        this.idProducto = idProducto;
        this.precio = precio;
        this.nombre = nombre;
    }
    
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "productos{" + "idProducto=" + idProducto + ", precio=" + precio + ", nombre=" + nombre + '}';
    }
}
