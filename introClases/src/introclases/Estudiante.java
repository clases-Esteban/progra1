package introclases;

public class Estudiante {

    private String nombre;
    private String apellidos;
    private int nota;
    private String cedula;
    private String estado;

    public Estudiante(String nombre, String apellidos, int nota, String cedula) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nota = nota;
        this.cedula = cedula;
        this.calcularEstado();
    }

    @Override
    public String toString() {
        return "Detalles de estudiante:\n"
                + "Nombre: " + nombre + "\n"
                + "Apellidos: " + apellidos + "\n"
                + "Nota: " + nota + "\n"
                + "Cedula: " + cedula + "\n"
                + "El estudiante " + estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void calcularEstado() {
        if (nota >= 70) {
            estado = "aprobó";
        } else {
            estado = "reprobó";
        }
    }
}
