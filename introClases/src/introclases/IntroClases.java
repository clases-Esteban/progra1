package introclases;

import java.util.*;

public class IntroClases {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList();
        System.out.println("Digite el número de la opción");
        System.out.println("1. Agregar estudiante");
        System.out.println("2. Salir");
        int opcion = teclado.nextInt();
        teclado.nextLine();
        while (opcion != 2) {
            System.out.println("Digite el nombre");
            String nombre = teclado.nextLine();
            System.out.println("Digite los apellidos");
            String apellidos = teclado.nextLine();
            System.out.println("Digite la nota");
            int nota = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Digite la cédula");
            String cedula = teclado.nextLine();
            Estudiante xyz = new Estudiante(nombre, apellidos, nota, cedula);
            estudiantes.add(xyz);
            System.out.println("Digite el número de la opción");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Salir");
            opcion = teclado.nextInt();
            teclado.nextLine();
        }
        System.out.println("Lista de estudiantes: \n");
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println(estudiantes.get(i).toString());
            System.out.println("-----------------");
        }

    }

}
