package ejerciciosjavaj;
import java.util.Scanner;

public class Ejercicio4 {
    public static void TemperaturaAmbiente() {
        Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese la temperatura actual (C): "); 
        double temperatura = dato.nextDouble();
        SensorTemperatura.verificarTemperatura(temperatura); 
    }
}

class SensorTemperatura {

    public static void verificarTemperatura(double temperatura) {
        System.out.println("Temperatura ingresada: " + temperatura + "C");


        if (temperatura >= 18.0 && temperatura <= 30) {
            MostrarTemperatura.mostrarInfo(true, temperatura);
        } else {
            MostrarTemperatura.mostrarInfo(false, temperatura);
        }
    }
}

class MostrarTemperatura {

    public static void mostrarInfo(boolean estado, double temperatura) {
        if (estado) {
            System.out.println("La temperatura es adecuada.");
        } else {
            System.out.println("La temperatura esta fuera del rango deseado. Rango permitido: 18C - 30C.");
        }
    }
}
