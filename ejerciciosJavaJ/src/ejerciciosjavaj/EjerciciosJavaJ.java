package ejerciciosjavaj;
import java.util.Scanner;

public class EjerciciosJavaJ {
    public static void main(String[] args) {
        Scanner tomaDato = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("Ingrese el numero del ejercicio que desea ver (1-29) o 0 para salir:");
            opcion = tomaDato.nextInt();
            
            if (opcion >= 1 && opcion <= 29) {
                switch (opcion) {
                    case 1:
                        Ejercicio1 obj1 = new Ejercicio1();
                        obj1.ejecutar();
                        break;
                    
                }
            } else if (opcion != 0) {
                System.out.println("El numero ingresado está fuera del rango (1-29), hágalo de nuevo :v");
            }
        } while (opcion != 0);
        
        System.out.println("Te salistes");
        tomaDato.close();
    }
}