package ejerciciosjavaj;

import java.util.Scanner;

public class Ejercicio8 {
    public static void calcularIMC() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese su peso en kg:");
        double peso = scanner.nextDouble();
        
        System.out.println("Ingrese su altura en metros:");
        double altura = scanner.nextDouble();
        
        if (peso <= 0 || altura <= 0) {
            System.out.println("El peso y la altura deben ser valores positivos.");
            return;
        }
        
        double imc = peso / (altura * altura);
        
        System.out.println("Su IMC es: " + imc);
        
        if (imc < 18.5) {
            System.out.println("Categoria: Bajo peso");
        } else if (imc < 24.9) {
            System.out.println("Categoria: Peso normal");
        } else if (imc < 29.9) {
            System.out.println("Categoria: Sobrepeso");
        } else {
            System.out.println("Categoria: Obesidad");
        }
    }
}
