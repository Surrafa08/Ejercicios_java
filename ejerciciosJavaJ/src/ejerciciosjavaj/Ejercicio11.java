package ejerciciosjavaj;

import java.util.Scanner;

public class Ejercicio11 {
    public static void menuRestaurante() {
        Scanner scanner = new Scanner(System.in);
        
        double total = 0;
        double descuento = 0;
        
        System.out.println("Bienvenido al restaurante. Selecciona los platos y bebidas:");
        
        System.out.println("Platos disponibles:");
        System.out.println("1. Plato A - $10.00");
        System.out.println("2. Plato B - $12.00");
        System.out.println("3. Plato C - $15.00");
        System.out.print("Selecciona el numero del plato (0 para terminar): ");
        int plato = scanner.nextInt();
        
        while (plato != 0) {
            switch (plato) {
                case 1:
                    total += 10.00;
                    break;
                case 2:
                    total += 12.00;
                    break;
                case 3:
                    total += 15.00;
                    break;
                default:
                    System.out.println("Plato no valido.");
            }
            System.out.print("Selecciona otro plato o 0 para terminar: ");
            plato = scanner.nextInt();
        }
        
        System.out.println("Bebidas disponibles:");
        System.out.println("1. Bebida A - $3.00");
        System.out.println("2. Bebida B - $4.00");
        System.out.println("3. Bebida C - $5.00");
        System.out.print("Selecciona el numero de la bebida (0 para terminar): ");
        int bebida = scanner.nextInt();
        
        while (bebida != 0) {
            switch (bebida) {
                case 1:
                    total += 3.00;
                    break;
                case 2:
                    total += 4.00;
                    break;
                case 3:
                    total += 5.00;
                    break;
                default:
                    System.out.println("Bebida no valida.");
            }
            System.out.print("Selecciona otra bebida o 0 para terminar: ");
            bebida = scanner.nextInt();
        }
        
        System.out.println("\nMetodo de pago:");
        System.out.println("1. Efectivo");
        System.out.println("2. Tarjeta de credito");
        System.out.println("3. Cheque");
        System.out.print("Selecciona el metodo de pago (1-3): ");
        int metodoPago = scanner.nextInt();
        
        switch (metodoPago) {
            case 1:
                descuento = total * 0.1; 
                break;
            case 2:
                descuento = total * 0.05; 
                break;
            case 3:
                descuento = total * 0.07; 
                break;
            default:
                System.out.println("Metodo de pago no valido.");
                return;
        }
        
        total -= descuento;
        
        System.out.println("\nCosto total de la comida:");
        System.out.println("Total sin descuento: $" + (total + descuento));
        System.out.println("Descuento: -$" + descuento);
        System.out.println("Total a pagar: $" + total);
    }
}
