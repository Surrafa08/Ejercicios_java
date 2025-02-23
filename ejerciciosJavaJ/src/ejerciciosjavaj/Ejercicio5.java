package ejerciciosjavaj;
import java.util.Scanner;

public class Ejercicio5 {
    public static void TemperaturaAmbiente2() {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese la temperatura actual:");
        double temperatura = dato.nextDouble();
        SensorTemperatura.verificarTemperatura(temperatura);
    }
}

class SensorTemperatura {
    public static void verificarTemperatura(double temperatura) {
        if (temperatura > 30) {
            MostrarTemperatura.mostrarInfo(true, temperatura);
        } else {
            MostrarTemperatura.mostrarInfo(false, temperatura);
        }
    }
}

class MostrarTemperatura {
    public static void mostrarInfo(boolean estado, double temperatura) {
        System.out.println("Temperatura actual: " + temperatura);
        if (estado) {
            System.out.println("Cuidado capo: Temperatura alta");
        } else {
            System.out.println("Temperatura normal, genial");
        }
    }
}
