/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.poo.poo_taller1;

/**
 *
 * @author jorge
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Datos del empleado
        int horasTrabajadas = 48;
        double tarifaHora = 5000;
        double porcentajeRetencion = 0.125; // 12.5%

        // Calcular salario bruto
        double salarioBruto = horasTrabajadas * tarifaHora;

        // Calcular retención en la fuente
        double retencionFuente = salarioBruto * porcentajeRetencion;

        // Calcular salario neto
        double salarioNeto = salarioBruto - retencionFuente;

        // Mostrar resultados
        System.out.println("Salario Bruto: $" + salarioBruto);
        System.out.println("Retención en la Fuente: $" + retencionFuente);
        System.out.println("Salario Neto: $" + salarioNeto);
    }
    
}
