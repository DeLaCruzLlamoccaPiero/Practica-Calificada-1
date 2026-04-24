/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicacalificada01;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mostrar menú
        System.out.println("---- Calculadora de Áreas ----");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.println("4. Rectángulo");
        System.out.print("Seleccione una figura: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el radio del círculo: ");
                double radio = scanner.nextDouble();
                double areaCiruclo = 3.1416 * radio * radio;
                System.out.printf("%nEl área del Círculo es: %.2f%n", areaCiruclo);
                break;

            case 2:
                System.out.print("Ingrese el lado del cuadrado: ");
                double lado = scanner.nextDouble();
                double areaCuadrado = lado * lado;
                System.out.printf("%nEl área del Cuadrado es: %.2f%n", areaCuadrado);
                break;

            case 3:
                System.out.print("Ingrese la base del triángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese la altura del triángulo: ");
                double alturaT = scanner.nextDouble();
                double areaTriangulo = (base * alturaT) / 2;
                System.out.printf("%nEl área del Triángulo es: %.2f%n", areaTriangulo);
                break;

            case 4:
                System.out.print("Ingrese la base del rectángulo: ");
                double baseR = scanner.nextDouble();
                System.out.print("Ingrese la altura del rectángulo: ");
                double alturaR = scanner.nextDouble();
                double areaRectangulo = baseR * alturaR;
                System.out.printf("%nEl área del Rectángulo es: %.2f%n", areaRectangulo);
                break;

            default:
                System.out.println("Figura inválida.");
                break;
        }

        scanner.close();
    }
}

