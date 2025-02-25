package ejerciciosjavaj;

import java.util.Scanner;

public class Ejercicio27 {

    public static void sumarNumeros() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de numeros que desea sumar: ");
        int cantidadNumeros = scanner.nextInt();
        
        double suma = 0;
        
        for (int i = 1; i <= cantidadNumeros; i++) {
            double numero;
            while (true) {
                System.out.print("Ingrese el numero " + i + ": ");
                if (scanner.hasNextDouble()) {
                    numero = scanner.nextDouble();
                    break;
                } else {
                    System.out.println("Eso no es un numero valido. Intente de nuevo.");
                    scanner.next(); // Limpiar el buffer
                }
            }
            suma += numero;
        }
        
        System.out.println("La suma total de los numeros ingresados es: " + suma);
    }
}
