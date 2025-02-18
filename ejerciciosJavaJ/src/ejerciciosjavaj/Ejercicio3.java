package ejerciciosjavaj;

import java.util.Scanner;

public class Ejercicio3 {
    public static void PesoAscensor() {
        Scanner dato = new Scanner(System.in);

        System.out.print("Ingrese su peso en kg: ");
        double pesoUsuario = dato.nextDouble();

        ProcesoAsc.verificarPeso(pesoUsuario);
    }
}

class ProcesoAsc {
    private static final double LIMITE_PESO = 1000;

    public static void verificarPeso(double pesoUsuario) {
        System.out.println("Peso ingresado: " + pesoUsuario + " kg");

        if (pesoUsuario <= LIMITE_PESO) {
            SolicitarPiso.pedirPiso();
        } else {
            Mostrar2.mostrarInfo(false, 0);
        }
    }

    public static void verificarPiso(int pisoDeseado) {
        System.out.println("Piso ingresado: " + pisoDeseado);

        if (pisoDeseado >= 1 && pisoDeseado <= 10) {
            Mostrar2.mostrarInfo(true, pisoDeseado);
        } else {
            Mostrar2.mostrarInfo(false, pisoDeseado);
        }
    }
}

class SolicitarPiso {
    public static void pedirPiso() {
        Scanner dato = new Scanner(System.in);

        System.out.print("Ingrese el piso al que desea ir (1-10): ");
        int pisoDeseado = dato.nextInt();

        ProcesoAsc.verificarPiso(pisoDeseado);
    }
}

class Mostrar2 {
    public static void mostrarInfo(boolean estado, int opcion) {
        if (estado) {
            System.out.println("El ascensor se está moviendo al piso " + opcion);
        } else {
            if (opcion == 0) {
                System.out.println("El ascensor está sobrecargado, no puede llevar más de 1000 kg.");
            } else {
                System.out.println("Error: El piso " + opcion + " no existe.");
            }
        }
    }
}
