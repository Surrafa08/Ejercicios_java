package ejerciciosjavaj;

import java.util.Scanner;

public class Ejercicio2 {

    public static void ejecutar() { // Asegúrate de que sea 'ejecutar', no 'Ascensor'
        // Definir el rango de pisos disponibles (por ejemplo, pisos del 1 al 10)
        int pisoMinimo = 1;
        int pisoMaximo = 10;

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el piso al que desea ir
        System.out.print("Ingrese el piso al que desea ir (entre " + pisoMinimo + " y " + pisoMaximo + "): ");
        int pisoDeseado = scanner.nextInt();

        // Validar si el piso deseado está dentro del rango permitido
        if (pisoDeseado >= pisoMinimo && pisoDeseado <= pisoMaximo) {
            System.out.println("El ascensor se está moviendo al piso " + pisoDeseado);
        } else {
            System.out.println("Error: El piso ingresado no es válido. Debe estar entre " + pisoMinimo + " y " + pisoMaximo + ".");
        }
    }
}
