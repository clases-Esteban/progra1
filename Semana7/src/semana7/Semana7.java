package semana7;

import java.util.*;

public class Semana7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*
        ArrayList<String> estudiantes = new ArrayList();
        System.out.println("1. Agregar Estudiante");
        System.out.println("2. Finalizar");
        System.out.println("Digite el número de la "
                + "opción que desee");
        int opcion = teclado.nextInt();
        teclado.nextLine();
        while (opcion != 2) {
            System.out.println("Digite el nombre del "
                    + "estudiante");
            estudiantes.add(teclado.nextLine());
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Finalizar");
            System.out.println("Digite el número de la "
                    + "opción que desee");
            opcion = teclado.nextInt();
            teclado.nextLine();
        }
        System.out.println(estudiantes);
        System.out.println("total es "+estudiantes.size());
         
        ArrayList<Integer> numeros = new ArrayList();
        System.out.println("Bienvenidos al programa "
                + "de ordenamiento de conjuntos");
        int opcion = 1;
        while (opcion != 2) {
            System.out.println("Digite un numero");
            numeros.add(teclado.nextInt());
            teclado.nextLine();
            System.out.println("1. Agregar numero");
            System.out.println("2. Finalizar");
            System.out.println("Digite el número de la "
                    + "opción que desee");
            opcion = teclado.nextInt();
            teclado.nextLine();
        }

        ArrayList<Integer> ordenado = new ArrayList();
        while (numeros.size() > 0) {
            int menor = 0;
            int posicion = 0;
            for (int i = 0; i < numeros.size(); i++) {
                if (i == 0) {
                    menor = numeros.get(i);
                }
                if(menor > numeros.get(i)){
                menor = numeros.get(i);
                posicion = i;
                }
            }
            ordenado.add(numeros.get(posicion));
            numeros.remove(posicion);
        }
        System.out.println(ordenado);
*/
        Random rand = new Random();
        int aleatorio = rand.nextInt(2) + 0;
        
        
    }
}
