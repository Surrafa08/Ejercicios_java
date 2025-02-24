package ejerciciosjavaj;

import java.util.Scanner;

public class Ejercicio10 {
    public static void clasificacionCampeonato() {
        Scanner scanner = new Scanner(System.in);
        
        int puntosEquipo1 = 0;
        int puntosEquipo2 = 0;
        
        System.out.println("Ingrese el resultado del partido:");
        System.out.println("Escriba 'G' si el Equipo 1 gana.");
        System.out.println("Escriba 'P' si el Equipo 1 pierde.");
        System.out.println("Escriba 'E' si el partido termina en empate.");
        
        char resultado = scanner.next().charAt(0);
        
        switch (resultado) {
            case 'G':
                puntosEquipo1 += 3;
                System.out.println("Equipo 1 gana el partido. Equipo 1 obtiene 3 puntos.");
                break;
            case 'P':
                puntosEquipo2 += 3;
                System.out.println("Equipo 1 pierde el partido. Equipo 2 obtiene 3 puntos.");
                break;
            case 'E':
                puntosEquipo1 += 1;
                puntosEquipo2 += 1;
                System.out.println("Empate. Ambos equipos obtienen 1 punto.");
                break;
            default:
                System.out.println("Resultado no valido. Ingrese G, P o E.");
                return;
        }
        
        System.out.println("\nClasificacion actual:");
        System.out.println("Equipo 1: " + puntosEquipo1 + " puntos");
        System.out.println("Equipo 2: " + puntosEquipo2 + " puntos");
    }
}
