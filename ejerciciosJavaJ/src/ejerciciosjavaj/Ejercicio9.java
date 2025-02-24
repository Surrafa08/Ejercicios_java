package ejerciciosjavaj;

import java.util.Scanner;

public class Ejercicio9 {
    public static void recomendarPelicula() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();
        
        if (edad < 0) {
            System.out.println("La edad no puede ser negativa.");
            return;
        }

        int categoria;
        
        if (edad < 7) {
            categoria = 1;  // Niños
        } else if (edad >= 7 && edad <= 17) {
            categoria = 2;  // Niños y Adolescentes
        } else if (edad >= 18 && edad <= 30) {
            categoria = 3;  // Adultos
        } else {
            categoria = 4;  // Personas Mayores
        }

        switch (categoria) {
            case 1:
                System.out.println("Recomendacion: Peliculas animadas y educativas aptas para todas las edades.");
                break;
            case 2:
                System.out.println("Recomendacion: Peliculas para la familia, como animaciones, aventuras y comedias familiares.");
                break;
            case 3:
                System.out.println("Recomendacion: Peliculas de accion, drama, comedia y ciencia ficcion.");
                break;
            case 4:
                System.out.println("Recomendacion: Peliculas clasicas y dramas.");
                break;
            default:
                System.out.println("Opcion invalida.");
                break;
        }
    }
}
