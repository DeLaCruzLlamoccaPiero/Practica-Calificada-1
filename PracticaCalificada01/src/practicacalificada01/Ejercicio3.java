/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicacalificada01;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("---Calculadora de Areas ---");
        System.out.println("1. Circulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triangulo");
        System.out.println("4. Rectangulo");
        System.out.print("Seleccione una figura: ");
        int opcion =scanner.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.print("Ingrese el radio del circulo: ");
                double radio = scanner.nextDouble();
                double areaCirculo= 3.1416*radio*radio;
                System.out.printf("%nEl area del Circulo es: %.2f%n", areaCirculo);
                break;
                
            case 2:
                System.out.print("Ingrese el lado del cuadrado: ");
                double lado =scanner.nextDouble();
                double areaCuadrado = lado*lado;
                System.out.printf("%nEl area del Cuadrado es: %.2f%n", areaCuadrado);
                break;
                
            case 3:
                System.out.print("Ingrese la base del triangulo: ");
                double base =scanner.nextDouble();
                
                System.out.print("Ingrese la altura del triangulo: ");
                double alturaT= scanner.nextDouble();
                double areaTriangulo = (base*alturaT)/2;
                
                System.out.printf("%nEl area del Triangulo es: %.2f%n", areaTriangulo);
               
                break;
                
            case 4:
                System.out.print("Ingrese la base del rectangulo: ");
                double baseD =scanner.nextDouble();
                System.out.print("Ingrese la altura del rectangulo: ");
                double alturaR = scanner.nextDouble();
                double areaRectangulo=baseD*alturaR;
                System.out.printf("%nEl area del Rectangulo es: %.2f%n", areaRectangulo);
                break;
                
            default:
                System.out.println("Figura invalida");
                break;
                
        }
        
            scanner.close();
    }
}
    
    
    