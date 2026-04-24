/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicacalificada01;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Ejercicio1 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        // Solicitar horas
        System.out.print("Ingrese las horas (0-23): ");
        int horas = scanner.nextInt();

        // Solicitar minutos
        System.out.print("Ingrese los minutos (0-59): ");
        int minutos = scanner.nextInt();

        // Solicitar segundos
        System.out.print("Ingrese los segundos (0-59): ");
        int segundos = scanner.nextInt();

        // Validar que los valores sean correctos
        if (horas < 0 || horas > 23) {
            System.out.println("Error: Las horas deben estar entre 0 y 23.");
            scanner.close();
            return;
        }
        if (minutos < 0 || minutos > 59) {
            System.out.println("Error: Los minutos deben estar entre 0 y 59.");
            scanner.close();
            return;
        }
        if (segundos < 0 || segundos > 59) {
            System.out.println("Error: Los segundos deben estar entre 0 y 59.");
            scanner.close();
            return;
        }

        // Calcular el siguiente segundo
        segundos++;

        if (segundos > 59) {
            segundos = 0;
            minutos++;
        }

        if (minutos > 59) {
            minutos = 0;
            horas++;
        }

        if (horas > 23) {
            horas = 0;
        }

        // Imprimir la hora resultante en formato 00:00:00
        System.out.printf("Salida: %02d:%02d:%02d%n", horas, minutos, segundos);

        scanner.close();
    }
}  
     