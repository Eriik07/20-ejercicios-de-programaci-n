/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import java.util.Scanner;

/**
 *
 * @author Eriik
 */
public class Aplicacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int año;
        System.out.println("Introduzca año: ");
        año = sc.nextInt();
        if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
            System.out.println("Es un año bisiesto");
            
        } else {
            System.out.println("No es un año bisiesto");
        }
    }
    }

