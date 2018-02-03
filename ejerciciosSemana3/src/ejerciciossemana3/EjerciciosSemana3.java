package ejerciciossemana3;

import java.util.*;

public class EjerciciosSemana3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double constanteFarenheit = 32;
        double constanteKelvin = 273.15;
        System.out.println("Digite la temperatura entera,"
                + " si decimales");
        int temperatura = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Digite la opción que necesita");
        System.out.println("1. Conversión a Fahrenheit");
        System.out.println("2. Conversión a Kelvin");
        int opcion = teclado.nextInt();
        teclado.nextLine();
        if (opcion == 1) {
            double temperaturaFinal = (1.8 * temperatura) + constanteFarenheit;
            System.out.println("La temperatura es " + 
                    temperaturaFinal + " grados F");
        }else{
            double temperaturaFinal = temperatura + constanteKelvin;
           System.out.println("La temperatura es " + 
                    temperaturaFinal + " grados K");
        }
        
        
    }

}
