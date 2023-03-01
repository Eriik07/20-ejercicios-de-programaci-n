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
  
    }
    public static void añobisiesto(){
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
    public static void totaldeventas(){
         Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de ventas");
        int numVentas=sc.nextInt();
         int sumaVentas=0;
        for (int i=0;i<numVentas;i++){
             System.out.println("Introduce el precio de la venta "+(i+1));
            int venta=sc.nextInt();
             sumaVentas=sumaVentas+venta;
             
        }
           System.out.println(sumaVentas);
     }   
    public static void dialaboral(){
        Scanner leer= new Scanner (System.in);
        
        System.out.println("Introduce un dia de la semana");
        String dia= leer.next();
        
        switch(dia){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un dia laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println("Es un dia de descanso");
            default:
                System.out.println("Introduce un dia de la semana");
        }
    }
    public static void conversordeTemperatura(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en celsius");
        double celsius = leer.nextDouble();
        double fahrenheit = (celsius * 9/5)+ 32;
        System.out.println("La temperatura en Fahrenheit es"+ fahrenheit);
        
    }    
    public static void CalculadoraIMC(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su peso en kilogramos:");
        int peso = leer.nextInt();
        System.out.println("Ingrese su altura en metros:");
        int altura = leer.nextInt();
        int imc = peso / (altura * altura);
        System.out.println("Su IMC es" + imc);
    }    
    public static void ConversordeMoneda(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad en dólares:");
        double dolares = leer.nextDouble();
        double tasaCambio = 19.8;
        double pesos = dolares * tasaCambio;
        System.out.println("$" + dolares + " dólares equivalen a $" + pesos + " pesos");
    }
    public static void CalcularelAreaAltura(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del triángulo: ");
        double base = leer.nextDouble();
        System.out.println("Ingrese la altura del triángulo: ");
         double altura = leer.nextDouble();
         System.out.print(double area = 0.5 * base * altura;);
    }
    
}     
    
