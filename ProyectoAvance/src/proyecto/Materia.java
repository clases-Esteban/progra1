
package proyecto;

import java.util.*;


public class Materia {
   private String nombre, profesor, codigo, dia, hora;
   int precio;

    public Materia(String nombre, String profesor, String codigo, String dia, String hora) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.codigo = codigo;
        this.dia = dia;
        this.hora = hora;
        Random aleatorio = new Random();
        this.precio = aleatorio.nextInt((80000 - 65000)+1)+65000;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Materia{" + "nombre=" + nombre + ", profesor=" + profesor + ", codigo=" + codigo + ", dia=" + dia + ", hora=" + hora + ", precio=" + precio + '}';
    }
   
}
