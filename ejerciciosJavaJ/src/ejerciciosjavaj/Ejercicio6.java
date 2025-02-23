package ejerciciosjavaj;

import java.util.Scanner;

public class Ejercicio6 {
    public static void SimulacionAscensor() {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese la temperatura actual:");
        double temperatura = dato.nextDouble();
        if(SensorTemperatura.verificarTemperatura(temperatura)) {
            System.out.println("Ingrese el piso que quieres ir:");
            int piso = dato.nextInt();
            Ascensor.moverAscensor(piso);
        } else {
            System.out.println("La temperatura no es adecuada para el movimiento de este ascensor.");
        }
    }
}

class SensorTemperatura {
    public static boolean verificarTemperatura(double temperatura) {
        if (temperatura > 30) {
            MostrarTemperatura.mostrarInfo(true, temperatura);
            return false;
        } else {
            MostrarTemperatura.mostrarInfo(false, temperatura);
            return true;
        }
    }
}

class MostrarTemperatura {
    public static void mostrarInfo(boolean estado, double temperatura) {
        System.out.println("Temperatura actual: " + temperatura);
        if (estado) {
            System.out.println("Alerta compa: Temperatura alta :v");
        } else {
            System.out.println("Temperatura normal");
        }
    }
}

class Ascensor {
    public static void moverAscensor(int piso) {
        System.out.println("Moviendo al piso " + piso);
    }
}
