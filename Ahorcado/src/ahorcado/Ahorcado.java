
package ahorcado;
import java.util.*;

public class Ahorcado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("escriba una palabra");
        String palabra = teclado.nextLine();
        ArrayList<String> palabraArreglo = 
                new ArrayList<>(Arrays.asList(palabra.split("(?!^)")));
        ArrayList<String> adivinar = new ArrayList();
        for (int i = 0; i < palabraArreglo.size(); i++) {
            adivinar.add("_");
        }
        String letra = teclado.nextLine();
        
        for (int i = 0; i < palabraArreglo.size(); i++) {
            if(palabraArreglo.get(i).equals(letra)){
                adivinar.set(i, letra);
            }
        }
        System.out.println(adivinar);
    }
    
}
