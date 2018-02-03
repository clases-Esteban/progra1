
package repasosemana2;
import java.util.Scanner;
public class RepasoSemana2 {

    public static void main(String[] args) {
        String nombreDelEstudiante = "Dulcinea";
        int edad = 25;
        System.out.println("Hola mundo!!!");
        System.out.println("Mi nombre es " + nombreDelEstudiante);
        System.out.println("Mi edad es " + edad);
        int edadFutura = 2047-2018;
        System.out.println("En el año 2047 tendré " + 
                (edad + edadFutura) + " años");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite su nombre");
        String nombreDeUsuario = teclado.nextLine();
        System.out.println("Hola " + nombreDeUsuario + 
                ". Por favor digite su edad");
        int edadDelUsuario = teclado.nextInt();
        teclado.nextLine();
        int edadFuturaUsuario = edadDelUsuario + edadFutura;
        System.out.println("En el 2047 usted tendrá " + 
                (edadDelUsuario + edadFutura) + " años");
        if(edadFuturaUsuario > 100){
            System.out.println("Probablemente su apellido es "
                    + "McCleod");
        }else{
            System.out.println("Disfrute su vida");
        }
        
        System.exit(0);
    }
    
}
