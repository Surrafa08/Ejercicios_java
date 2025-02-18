package ejerciciosjavaj;

import java.util.Scanner;

public class Ejercicio2 {

    public static void Ascensor() { 
        int pisoMinimo = 1;
        int pisoMaximo = 10;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el piso al que desea ir (entre " + pisoMinimo + " y " + pisoMaximo + "): ");
        int pisoDeseado = scanner.nextInt();

        if (pisoDeseado >= pisoMinimo && pisoDeseado <= pisoMaximo) {
            System.out.println("El ascensor se está moviendo al piso " + pisoDeseado);
        } else {
            System.out.println("Error: El piso ingresado no es válido. Debe estar entre " + pisoMinimo + " y " + pisoMaximo + ".");
        }
    }
}
