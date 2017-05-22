/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.laboratorio;

import java.util.Scanner;

/**
 *
 * @author glori
 */
public class ParcialLaboratorio {

    
    public static void main(String[] args) {
        
        Scanner t = new Scanner(System.in);
        int numero_uno = 0;
        int numero_dos = 0;
        
        
        System.out.println("Ingresa 2 numeros");
        numero_uno = t.nextInt();
        numero_dos = t.nextInt();
        
        
        
        if(numero_uno == numero_dos){
            System.out.println("Los numeros son iguales");
            
        }else{
    
            System.out.println("Los numeros son diferentes");
    
}
        }
    }

    