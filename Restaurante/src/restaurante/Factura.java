package restaurante;

import java.util.*;

public class Factura {

    private ArrayList<Platillo> platillos;
    private int subtotal;
    private double impuestoServicio, impuestoVentas, total;
    private String fecha;

    public Factura(ArrayList<Platillo> platillos) {
        this.platillos = platillos;
        this.fecha = ponerFecha();
        this.subtotal = calcularSubTotal();
        this.impuestoServicio = calcularImpuestoServicio();
        this.impuestoVentas = calcularImpuestoVentas();
        this.total = calcularTotal();
    }

    public String ponerFecha() {
        Date hoy = new Date();
        return hoy.toString();
    }

    public int calcularSubTotal() {
        int resultado = 0;
        for (int i = 0; i < platillos.size(); i++) {
            resultado += platillos.get(i).getPrecio();
        }
        return resultado;
    }

    public double calcularImpuestoVentas() {
        return subtotal * 0.13;
    }

    public double calcularImpuestoServicio() {
        return subtotal * 0.10;
    }

    public double calcularTotal() {
        return subtotal + impuestoServicio + impuestoVentas;
    }

    @Override
    public String toString() {
        String resultado = "";
        for (int i = 0; i < platillos.size(); i++) {
            resultado += (i+1)+". " + platillos.get(i).getNombre() +
                    "\n Precio: " + platillos.get(i).getPrecio() + "\n";
        }
        resultado += "Subtotal: " + subtotal + "\n";
        resultado += "Impuesto Servicio: " + impuestoServicio + "\n";
        resultado += "Impuesto Ventas: " + impuestoVentas + "\n";
        resultado += "Total: " + total + "\n";
  
        return resultado;
    }
    
}
