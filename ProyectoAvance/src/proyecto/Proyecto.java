package proyecto;

import java.util.*;

public class Proyecto {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //variables globales
        int opcionPrincipal = 1;
        ArrayList<Estudiante> estudiantes = new ArrayList();
        ArrayList<Materia> materias = new ArrayList();
        Estudiante estudianteSeleccionado;
        ArrayList<Materia> materiasSeleccionadas = new ArrayList();
        //Menu principal

        System.out.println("Bienvenido al sistema de matrícula");
        while (opcionPrincipal != 4) {
            System.out.println("Opciones:");
            System.out.println("1. Registrar Estudiante");
            System.out.println("2. Registrar Materia");
            System.out.println("3. Matricular");
            System.out.println("4. Salir");
            opcionPrincipal = teclado.nextInt();
            teclado.nextLine();
            if (opcionPrincipal == 1) {
                //agregar estudiante
                System.out.println("Digite el nombre del estudiante");
                String nombre = teclado.nextLine();
                System.out.println("Digite los apellidos del estudiante");
                String apellido = teclado.nextLine();
                System.out.println("Digite el telefono del estudiante");
                String telefono = teclado.nextLine();
                System.out.println("Digite el correo del estudiante");
                String email = teclado.nextLine();
                System.out.println("Digite la dirección del estudiante");
                String direccion = teclado.nextLine();
                Estudiante estudiante = new Estudiante(nombre, apellido, telefono, direccion, email);
                estudiantes.add(estudiante);
            } else if (opcionPrincipal == 2) {
                //agregar materia
                System.out.println("Digite el nombre de la materia");
                String nombre = teclado.nextLine();
                System.out.println("Digite el codigo de la materia");
                String codigo = teclado.nextLine();
                System.out.println("Digite el profesor de la materia");
                String profesor = teclado.nextLine();
                System.out.println("Digite el dia de la materia");
                String dia = teclado.nextLine();
                System.out.println("Digite la hora de la materia");
                String hora = teclado.nextLine();
                Materia materia = new Materia(nombre, profesor, codigo, dia, hora);
                materias.add(materia);
            } else if (opcionPrincipal == 3) {
                System.out.println("Digite el número del estudiante que va a matricular");
                for (int i = 0; i < estudiantes.size(); i++) {
                    System.out.println((i + 1) + " " + estudiantes.get(i).getNombre() + " "
                            + estudiantes.get(i).getApellido());
                }
                estudianteSeleccionado = estudiantes.get(teclado.nextInt() - 1);
                teclado.nextLine();
                int opcionMatricula = 1;
                while (opcionMatricula != 2 && materias.size() < 5) {
                    System.out.println("Digite el numero de la materia a matricular");
                    for (int i = 0; i < materias.size(); i++) {
                        System.out.println((i + 1) + " " + materias.get(i).getCodigo() + " "
                                + materias.get(i).getNombre());
                    }
                    materiasSeleccionadas.add(materias.get(teclado.nextInt()-1));
                    teclado.nextLine();
                    System.out.println("Digite 1 para agregar otra materia o 2 para salir");
                    opcionMatricula = teclado.nextInt();
                    teclado.nextLine();
                }
                Matricula matricula = new Matricula(estudianteSeleccionado, materiasSeleccionadas);
                matricula.setCosto(matricula.calcularCostoSinDescuento());
                matricula.setCostoDescuento(matricula.calcularCostoFinal());
                
                System.out.println(matricula.toString());
            }
        }
    }
}
