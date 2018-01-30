
package miprimerjava;
import java.util.Scanner;
public class MiPrimerJava {

    public static void main(String[] args) {
        /*
        String nombreDeEstudiante = "Marcela";
        int edadDeEstudiante = 25;
        System.out.println("Hola mundo!! Mi nombre es " 
                + nombreDeEstudiante + " y tengo " + 
                edadDeEstudiante + " años");
        
        int num1 = 90;
        int num2 = 46;
        System.out.println("Suma es " + (num1 + num2));
        System.out.println("Resta es " + (num1 - num2));
        System.out.println("Division es " + ((double)num1 / (double)num2));
        System.out.println("Multiplicacion es " + (num1 * num2));
        
        */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite un número");
        int num1 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Digite otro número");
        int num2 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Suma es " + (num1 + num2));
        System.out.println("Resta es " + (num1 - num2));
        System.out.println("Division es " + ((double)num1 / (double)num2));
        System.out.println("Multiplicacion es " + (num1 * num2));
        System.exit(0);
    }
    
}
