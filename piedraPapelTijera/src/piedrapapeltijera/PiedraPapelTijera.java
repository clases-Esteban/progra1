package piedrapapeltijera;

import java.util.*;

public class PiedraPapelTijera {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido al juego de Piedra"
                + "papel tijera");
        System.out.println("Seleccione una opción");
        System.out.println("1. Jugar");
        System.out.println("2. Salir");
        int opcionJugar = teclado.nextInt();
        teclado.nextLine();
        ArrayList<String> opciones = new ArrayList();
        opciones.add("Piedra");
        opciones.add("Papel");
        opciones.add("Tijera");
        while (opcionJugar != 2) {
            int marcadorJugador = 0;
            int marcadorAI = 0;
            while (marcadorJugador < 2 && marcadorAI < 2) {
                System.out.println("Digite la opción de su jugada");
                System.out.println("1. Piedra");
                System.out.println("2. Papel");
                System.out.println("3. Tijera");
                int jugada = teclado.nextInt()-1;
                teclado.nextLine();
                Random rand = new Random();
                int jugadaAI = rand.nextInt(3);
                System.out.println("Jugador: " + opciones.get(jugada));
                System.out.println("AI: " + opciones.get(jugadaAI));
                if(jugada == 0 && jugadaAI == 1){
                    marcadorAI++;
                }else if(jugada == 0 && jugadaAI == 2){
                    marcadorJugador++;
                }else if(jugada == 1 && jugadaAI == 0){
                    marcadorJugador++;
                }else if(jugada == 1 && jugadaAI == 2){
                    marcadorAI++;
                }else if(jugada == 2 && jugadaAI == 0){
                    marcadorAI++;
                }else if(jugada == 2 && jugadaAI == 1){
                    marcadorJugador++;
                }
                System.out.println("Marcador");
                System.out.println("Jugador: " + marcadorJugador);
                System.out.println("AI: " + marcadorAI);
            }
            if(marcadorJugador > marcadorAI){
                System.out.println("Felicidades, usted ha ganado");
            }else{
                System.out.println("Lo siento, ha perdido");
            }
            System.out.println("Seleccione una opción");
            System.out.println("1. Volver a jugar");
            System.out.println("2. Salir");
            opcionJugar = teclado.nextInt();
        }

    }

}
