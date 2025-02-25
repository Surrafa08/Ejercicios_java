package ejerciciosjavaj;

import java.util.Scanner;

public class Ejercicio22 {

    public static void gestionTareas() {
        Scanner scanner = new Scanner(System.in);
        String listaTareas = "";
        String respuesta;
        
        do {
            System.out.print("Ingrese la descripcion de la tarea: ");
            String descripcion = scanner.nextLine();
            
            System.out.print("Ingrese la fecha de vencimiento (formato dd/mm/yyyy): ");
            String fechaVencimiento = scanner.nextLine();
            
            listaTareas += "Tarea: " + descripcion + ", Fecha de vencimiento: " + fechaVencimiento + "\n";
            
            System.out.print("Desea agregar otra tarea (si/no): ");
            respuesta = scanner.nextLine();
            
        } while (respuesta.equalsIgnoreCase("si"));
        
        System.out.println("\nLista de tareas:");
        System.out.println(listaTareas);
    }
}
