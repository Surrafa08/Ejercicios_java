package ejerciciosjavaj;

import java.util.Scanner;

public class Ejercicio26 {

    public static void agendaContactos() {
        Scanner scanner = new Scanner(System.in);
        String agenda = "";
        String respuesta;
        
        do {
            System.out.print("Ingrese el nombre del contacto: ");
            String nombre = scanner.nextLine();
            
            System.out.print("Ingrese el numero de telefono del contacto: ");
            String telefono = scanner.nextLine();
            
            agenda += "Contacto: " + nombre + ", Telefono: " + telefono + "\n";
            
            System.out.print("Desea agregar otro contacto (si/no): ");
            respuesta = scanner.nextLine();
            
        } while (respuesta.equalsIgnoreCase("si"));
        
        System.out.println("\nLista de contactos registrados:");
        System.out.println(agenda);
    }
}
