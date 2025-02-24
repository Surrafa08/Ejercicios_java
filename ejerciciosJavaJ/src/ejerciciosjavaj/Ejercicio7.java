package ejerciciosjavaj;

import java.util.Scanner;

public class Ejercicio7 {
    public static void calcularCompra() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el tipo de producto que desea comprar (A, V, E):");
        char tipoProducto = scanner.next().charAt(0);
        
        System.out.println("Ingrese la cantidad de unidades:");
        int cantidad = scanner.nextInt();
        
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser un numero positivo.");
            return;
        }
        
        double precioBase = 0;
        double descuento = 0;
        
        switch (tipoProducto) {
            case 'A':
                precioBase = 50;
                descuento = 0.10;
                break;
            case 'V':
                precioBase = 100;
                descuento = 0.05;
                break;
            case 'E':
                precioBase = 200;
                descuento = 0;
                break;
            default:
                System.out.println("Tipo de producto invalido.");
                return;
        }
        
        double costoSinDescuento = precioBase * cantidad;
        double costoConDescuento = costoSinDescuento - (costoSinDescuento * descuento);
        
        System.out.println("Costo sin descuento: " + costoSinDescuento);
        System.out.println("Costo con descuento: " + costoConDescuento);
    }
}
