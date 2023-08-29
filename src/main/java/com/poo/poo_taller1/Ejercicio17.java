/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.poo.poo_taller1;
import java.util.Scanner;
/**
 *
 * @author jorge
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        
        // Calcular el área del círculo (π * r^2)
        double area = Math.PI * Math.pow(radio, 2);
        
        // Calcular la longitud de la circunferencia (2 * π * r)
        double circunferencia = 2 * Math.PI * radio;
        
        System.out.println("El área del círculo es: " + area);
        System.out.println("La longitud de la circunferencia es: " + circunferencia);
        
        scanner.close();
    }
    
}
