package ejerciciosjavaj;

import java.util.Scanner;

public class Ejercicio25 {

    public static void carritoCompras() {
        Scanner scanner = new Scanner(System.in);
        String productosCarrito = "";
        double totalCompra = 0;
        String respuesta;
        
        do {
            System.out.print("Ingrese el nombre del producto: ");
            String producto = scanner.nextLine();
            
            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();
            scanner.nextLine();
            
            productosCarrito += "Producto: " + producto + ", Precio: " + precio + "\n";
            totalCompra += precio;
            
            System.out.print("Desea agregar otro producto (si/no): ");
            respuesta = scanner.nextLine();
            
        } while (respuesta.equalsIgnoreCase("si"));
        
        System.out.println("\nResumen de la compra:");
        System.out.println(productosCarrito);
        System.out.println("Total de la compra: " + totalCompra);
    }
}
