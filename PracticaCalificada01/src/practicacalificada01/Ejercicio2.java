/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicacalificada01;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
       
        System.out.println("Ingrese la tarifa por hora: ");
        double tarifaHora=scanner.nextDouble();
        
        System.out.println("Ingrese las horas trabajadas: ");
        double horasTrabajadas= scanner.nextDouble();
        
        double horasNormales;
        double horasExtras;
        double sueldoNormal;
        double sueldoExtras;
        
       if (horasTrabajadas <=40) {
           horasNormales = horasTrabajadas;
           horasExtras = 0;
           sueldoNormal= horasNormales * tarifaHora;
           sueldoExtras = 0;   
       } else {
           horasNormales =40;
           horasExtras = horasTrabajadas - 40;
           sueldoNormal = horasNormales * tarifaHora;
           sueldoExtras = horasExtras * (tarifaHora * 1.5);
           }
       
          double sueldoBase = sueldoNormal + sueldoExtras;
          
          double bonoMovilidad = (sueldoBase > 1500) ? 100: 0;
          
          double totalNeto = sueldoBase + bonoMovilidad;
          
        System.out.println();
        System.out.println("---- BOLETA DE PAGO ----");
        System.out.printf("Sueldo por horas normales (%.0fh): S/ %.2f%n", horasNormales, sueldoNormal);
        System.out.printf("Sueldo por horas extras (%.0fh): S/ %.2f%n", horasExtras, sueldoExtras);
        System.out.printf("Bono de movilidad aplicado: S/ %.2f%n", bonoMovilidad);
        System.out.printf("Total neto a pagar: S/ %.2f%n", totalNeto);
           
           scanner.close();
             
    }
}
    