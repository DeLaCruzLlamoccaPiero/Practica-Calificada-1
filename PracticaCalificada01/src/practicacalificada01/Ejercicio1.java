/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicacalificada01;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese las horas (0-23)");
        int horas = scanner.nextInt();
                
        System.out.println("Ingrese los minutos (0-59)");
        int minutos = scanner.nextInt();
                
        System.out.println("Ingrese los segundos (0-59)");
        int segundos = scanner.nextInt();
        
        if (horas <0 || horas >23){
            System.out.println("Error: Las horas deben estar entre 0 y 23");
            scanner.close();
            return;
        }
        if (minutos <0 || minutos > 59) {
            System.out.println("Error");
            scanner.close();
            return;
        }    
        if (segundos <0 || segundos >59) {
            System.out.println("Error");
            scanner.close();
            return;
        }
        
        segundos++;
        
        if (segundos >59){
            segundos=0;
            minutos++;
        }
        
        if (minutos >59 ){
            minutos=0;
            horas++;
        }         
        
        if (horas >23 ){
            horas=0;
        }         
        
        System.out.printf("Salida: %02d*%02d:%02dn", horas, minutos, segundos);
        
        scanner.close();
        
 
    }
}

  
        
 

    
     