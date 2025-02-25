package ejerciciosjavaj;

import java.util.Scanner;

public class Ejercicio23 {

    public static void registroVentas() {
        Scanner scanner = new Scanner(System.in);
        String resumenVentas = "";
        double totalVentas = 0;
        String respuesta;
        
        do {
            System.out.print("Ingrese el nombre del producto vendido: ");
            String producto = scanner.nextLine();
            
            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();
            scanner.nextLine();  // Limpiar el buffer
            
            resumenVentas += "Producto: " + producto + ", Precio: " + precio + "\n";
            totalVentas += precio;
            
            System.out.print("Desea registrar otra venta (si/no): ");
            respuesta = scanner.nextLine();
            
        } while (respuesta.equalsIgnoreCase("si"));
        
        System.out.println("\nResumen de ventas:");
        System.out.println(resumenVentas);
        System.out.println("Monto total de ventas: " + totalVentas);
    }
}
