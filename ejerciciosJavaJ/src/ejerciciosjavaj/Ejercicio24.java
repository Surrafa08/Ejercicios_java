package ejerciciosjavaj;

import java.util.Scanner;

public class Ejercicio24 {

    public static void registroVehiculos() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el numero de vehiculos que ingresaran al parqueadero: ");
        int numeroVehiculos = scanner.nextInt();
        scanner.nextLine(); 
        
        String resumenVehiculos = "";
        
        for (int i = 1; i <= numeroVehiculos; i++) {
            System.out.print("Ingrese la placa del vehiculo " + i + ": ");
            String placa = scanner.nextLine();
            
            System.out.print("Ingrese la hora de ingreso (formato HH:mm): ");
            String horaIngreso = scanner.nextLine();
            
            resumenVehiculos += "Vehiculo " + i + " - Placa: " + placa + ", Hora de ingreso: " + horaIngreso + "\n";
        }
        
        System.out.println("\nResumen de vehiculos registrados:");
        System.out.println(resumenVehiculos);
    }
}
