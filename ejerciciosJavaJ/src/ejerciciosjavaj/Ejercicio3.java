package ejerciciosjavaj;
import java.util.Scanner;

public class Ejercicio3 {
    public static void PesoAscensor() {
        Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese el piso al que quiere ir: ");
        int opcion = dato.nextInt();
        ProcesoAsc.procesarInfo(opcion);
    }
}

class ProcesoAsc {
    public static void procesarInfo(int opcion) {
        System.out.println("Opcion ingresada: " + opcion);
        if (opcion <= 10 && opcion >= 1) {
            Mostrar3.mostrarInfo(true, opcion); 
        } else {
            Mostrar3.mostrarInfo(false, opcion); 
        }
    }
}

class Mostrar3 {
    public static void mostrarInfo(boolean estado, int opcion) {
        if (estado) {
            System.out.println("Moviendose al piso " + opcion);
        } else {
            System.out.println("Error: El piso " + opcion + " no existe.");
        }
    }
}
