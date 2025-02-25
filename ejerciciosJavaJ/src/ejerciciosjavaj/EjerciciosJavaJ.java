package ejerciciosjavaj;

import java.util.Scanner;

public class EjerciciosJavaJ {
    public static void main(String[] args) {
        Scanner tomaDato = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("Ingrese el numero del ejercicio que desea ver (1-29) o 0 para salir:");
            opcion = tomaDato.nextInt();
            
            if (opcion >= 1 && opcion <= 28) {
                switch (opcion) {
                    case 1:
                        Ejercicio1 obj1 = new Ejercicio1();
                        obj1.ejecutar();
                        break;
                        
                    case 2:
                        Ejercicio2 obj2 = new Ejercicio2();
                        obj2.Ascensor();
                        break;
                        
                    case 3:
                        Ejercicio3 obj3 = new Ejercicio3();
                        obj3.PesoAscensor();
                        break;
                        
                    case 4:
                        Ejercicio4 obj4 = new Ejercicio4();
                        obj4.TemperaturaAmbiente();
                        break;
                        
                    case 5:
                        Ejercicio5 obj5 = new Ejercicio5();
                        obj5.TemperaturaAmbiente2();
                        break;
                        
                    case 6:
                        Ejercicio6 obj6 = new Ejercicio6();
                        obj6.SimulacionAscensor();
                        break;
                        
                    case 7:
                        Ejercicio7 obj7 = new Ejercicio7();
                        obj7.calcularCompra();
                        break;
                        
                    case 8:
                        Ejercicio8 obj8 = new Ejercicio8();
                        obj8.calcularIMC();
                        break;
                        
                    case 9:
                        Ejercicio9 obj9 = new Ejercicio9();
                        obj9.recomendarPelicula();
                        break;
                        
                    case 10:
                        Ejercicio10 obj10 = new Ejercicio10();
                        obj10.clasificacionCampeonato();
                        break;
                        
                    case 11:
                        Ejercicio11 obj11 = new Ejercicio11();
                        obj11.menuRestaurante();
                        break;
                        
                    case 12:
                        Ejercicio12 obj12 = new Ejercicio12();
                        obj12.cajeroAutomatico();
                        break;
                        
                    case 13:
                        Ejercicio13 obj13 = new Ejercicio13();
                        obj13.compraTiendaOnline();
                        break;
                        
                    case 14:
                        Ejercicio14 obj14 = new Ejercicio14();
                        obj14.impresora();
                        break;
                        
                    case 15:
                        Ejercicio15 obj15 = new Ejercicio15();
                        obj15.viajeEnCoche();
                        break;
                        
                    case 16:
                        Ejercicio16 obj16 = new Ejercicio16();
                        obj16.cuentaRegresiva();
                        break;
                        
                    case 17:
                        Ejercicio17 obj17 = new Ejercicio17();
                        obj17.juegoAdivinanza();
                        break;
                        
                    case 18:
                        Ejercicio18 obj18 = new Ejercicio18();
                        obj18.registroBiblioteca();
                        break;
                        
                    case 19:
                        Ejercicio19 obj19 = new Ejercicio19();
                        obj19.menuComidasRapidas();
                        break;
                        
                    case 20:
                        Ejercicio20 obj20 = new Ejercicio20();
                        obj20.sensorTemperatura();
                        break;
                        
                    case 21:
                        Ejercicio21 obj21 = new Ejercicio21();
                        obj21.ingresarResultados();
                        break;
                        
                    case 22:
                        Ejercicio22 obj22 = new Ejercicio22();
                        obj22.gestionTareas();
                        break;
                    
                    case 23:
                        Ejercicio23 obj23 = new Ejercicio23();
                        obj23.registroVentas();
                        break;
                        
                    case 24:
                        Ejercicio24 obj24 = new Ejercicio24();
                        obj24.registroVehiculos();
                        break;
                        
                    case 25:
                        Ejercicio25 obj25 = new Ejercicio25();
                        obj25.carritoCompras();
                        break;
                        
                    case 26:
                        Ejercicio26 obj26 = new Ejercicio26();
                        obj26.agendaContactos();
                        break;
                        
                    case 27:
                        Ejercicio27 obj27 = new Ejercicio27();
                        obj27.sumarNumeros();
                        break;
                        
                    case 28:
                        Ejercicio28 obj28 = new Ejercicio28();
                        obj28.procesoVentas();
                        break;
                
                }
                
            } else if (opcion != 0) {
                System.out.println("El numero ingresado esta fuera del rango (1-28), hagalo de nuevo xd|");
            }
        } while (opcion != 0);
        
        System.out.println("Te saliste");
        tomaDato.close();
    }
}

//esto es un controlador de ejecucion para llamar el ejercicio que elijamos y lo ejecuta <3
