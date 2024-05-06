package com.mycompany.figurasgeometricaspoo;

import java.util.Scanner;

public class Principal {
    
    //Complejidad temporal: O(1) Tiempo constante.
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la figura:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el color de la figura:");
        String color = scanner.nextLine();

        System.out.println("Ingrese el tipo de figura (1: Circulo, 2: Rectangulo, 3: Triangulo Rectangulo, 4: Triangulo Isosceles):");
        int tipoFigura = scanner.nextInt();

        FiguraGeometrica figura = null;

        switch (tipoFigura) {
            case 1:
                System.out.println("Ingrese el radio del círculo:");
                double radioCirculo = scanner.nextDouble();
                figura = new Circulo(nombre, color, radioCirculo);
                break;
            case 2:
                System.out.println("Ingrese el valor del lado 1 del rectángulo:");
                double lado1Rectangulo = scanner.nextDouble();
                System.out.println("Ingrese el valor del lado 2 del rectángulo:");
                double lado2Rectangulo = scanner.nextDouble();
                figura = new Rectangulo(nombre, color, lado1Rectangulo, lado2Rectangulo);
                break;
            case 3:
                System.out.println("Ingrese el valor de la base del triángulo:");
                double baseTriangulo = scanner.nextDouble();
                System.out.println("Ingrese el valor de la altura del triángulo:");
                double alturaTriangulo = scanner.nextDouble();
                figura = new Triangulo(nombre, color, baseTriangulo, alturaTriangulo);
                break;
            case 4:
                System.out.println("Ingrese el valor del primer lado del triángulo:");
                double primerLado = scanner.nextDouble();
                System.out.println("Ingrese el valor del segundo lado del triángulo:");
                double segundoLado = scanner.nextDouble();
                System.out.println("Ingrese el valor del tercer lado del triángulo:");
                double tercerLado = scanner.nextDouble();
                figura = new TrianguloIsosceles(nombre, color, primerLado, segundoLado, tercerLado);
                break;
            default:
                System.out.println("Opción no válida");
                System.exit(1);
        }

        System.out.println("Área de la figura: " + figura.obtenerArea());
        System.out.println("Perímetro de la figura: " + figura.obtenerPerimetro());

        scanner.close();
    }
}
