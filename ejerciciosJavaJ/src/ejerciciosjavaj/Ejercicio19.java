package ejerciciosjavaj;

import java.util.Scanner;

public class Ejercicio19 {
    public static void menuComidasRapidas() {
        Scanner scanner = new Scanner(System.in);
        double costoTotal = 0;
        int opcion;
        
        do {
            System.out.println("Seleccione una opcion de menu");
            System.out.println("1. Opcion 1 - 8000");
            System.out.println("2. Opcion 2 - 20000");
            System.out.println("3. Opcion 3 - 4000");
            System.out.println("4. Opcion 4 - 8000");
            System.out.println("5. Finalizar pedido");
            
            System.out.print("Opcion: ");
            opcion = scanner.nextInt();
            
            switch(opcion) {
                case 1:
                    costoTotal += 8000;
                    break;
                case 2:
                    costoTotal += 20000;
                    break;
                case 3:
                    costoTotal += 4000;
                    break;
                case 4:
                    costoTotal += 8000;
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            
        } while(opcion != 5);
        
        System.out.println("El costo total de su pedido es: " + costoTotal);
        System.out.println("Gracias por su compra");
    }
}
