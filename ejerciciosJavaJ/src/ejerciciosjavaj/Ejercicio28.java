package ejerciciosjavaj;

import java.util.Scanner;

public class Ejercicio28 {

    public static void procesoVentas() {
        Scanner scanner = new Scanner(System.in);
        String resumenVentas = "";
        double totalVentas = 0;
        String respuesta;
        
        do {
            System.out.print("Ingrese el nombre del producto: ");
            String producto = scanner.nextLine();
            
            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();
            
            System.out.print("Ingrese la cantidad vendida: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine(); 
            
            double totalProducto = precio * cantidad;
            resumenVentas += "Producto: " + producto + ", Precio: " + precio + ", Cantidad: " + cantidad + ", Total: " + totalProducto + "\n";
            totalVentas += totalProducto;
            
            System.out.print("Desea registrar otra venta (si/no): ");
            respuesta = scanner.nextLine();
            
        } while (respuesta.equalsIgnoreCase("si"));
        
        System.out.println("\nResumen de ventas:");
        System.out.println(resumenVentas);
        System.out.println("Monto total de ventas: " + totalVentas);
    }
}
