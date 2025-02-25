package ejerciciosjavaj;

import java.util.Scanner;

public class Ejercicio21 {

    public static void ingresarResultados() {
        Scanner scanner = new Scanner(System.in);
        double resultado, sumaResultados = 0;
        int contador = 0;
        String respuesta;
        
        do {
            System.out.print("Ingrese el resultado del examen: ");
            resultado = scanner.nextDouble();
            sumaResultados += resultado;
            contador++;
            
            System.out.print("Desea ingresar otro resultado (si/no): ");
            respuesta = scanner.next();
            
        } while (respuesta.equalsIgnoreCase("si"));
        
        double promedio = sumaResultados / contador;
        System.out.println("Promedio de los resultados: " + promedio);
        
        if (promedio >= 6) {
            System.out.println("El estudiante ha aprobado.");
        } else {
            System.out.println("El estudiante ha reprobado.");
        }
    }
}
