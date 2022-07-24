
package Entidades;


public class Area {    
    private String codigo_area;
    public String nombre;
    public String telefono;

    public Area(String codigo_area, String nombre, String telefono) {
        this.codigo_area = codigo_area;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getCodigo_area() {
        return codigo_area;
    }

    public void setCodigo_area(String codigo_area) {
        this.codigo_area = codigo_area;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    
}
