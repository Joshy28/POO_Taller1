/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.poo.poo_taller1;

/**
 *
 * @author jorge
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int EDJUAN = 9;// Edad de Juan siempre sera 9
        
        int EDALBER = 2 * EDJUAN / 3; //Edad de Alberto 
        int EDANA = 4 * EDJUAN / 3; //Edad de Ana   
        int EDMAMA = EDJUAN + EDALBER + EDANA; // Edad de Mama
        
        
        //Imprimiendolo de esta manera queda como la salida del libro de Efrain 
        System.out.println("LAS EDADES SON:");
        System.out.println("ALBERTO: " + EDALBER + " JUAN: " + EDJUAN);
        System.out.println("ANA: " + EDANA + " MAMA: " + EDMAMA);
    }
    
}
