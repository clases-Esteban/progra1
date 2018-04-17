package proyecto;

import java.util.*;

public class Matricula {

    private Estudiante estudiante;
    private ArrayList<Materia> materias;
    private int costo;
    private double costoDescuento;

    public double getCostoDescuento() {
        return costoDescuento;
    }

    public void setCostoDescuento(double costoDescuento) {
        this.costoDescuento = costoDescuento;
    }

    public Matricula(Estudiante estudiante, ArrayList<Materia> materias) {
        this.estudiante = estudiante;
        this.materias = materias;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        String materiasString = "";
        for (int i = 0; i < materias.size(); i++) {
            materiasString += materias.get(i).toString() + "\n";
        }
        return "Matricula{" + "estudiante=" + estudiante.toString() + ", materias=" + materiasString + 
            "Costo sin descuento = "+ costo+ " , Costo con descuento = "+ costoDescuento+'}';
    }
    public int calcularCostoSinDescuento(){
        int costoSinDescuento = 0;
        for (int i = 0; i < materias.size(); i++) {
            costoSinDescuento += materias.get(i).getPrecio();
        }
        return costoSinDescuento;
    }
    
    public double calcularCostoFinal() {
        int costo = calcularCostoSinDescuento();
        double descuento = 0;
        if (materias.size() == 2) {
            descuento = costo * 0.10;
        } else if (materias.size() == 3) {
            descuento = costo * 0.15;
        } else if (materias.size() == 3) {
            descuento = costo * 0.20;
        }
        return (costo - descuento);
    }

}
