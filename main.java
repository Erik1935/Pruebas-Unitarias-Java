/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadora;

/**
 *
 * @author erikj
 */
public class main {
    public static void main(String[] args) {
        calcu calcu1 = new calcu();
        System.out.println("La suma es: "+calcu1.suma(2,2));
         System.out.println("La resta es:"+calcu1.resta(2,2));
          System.out.println("La multiplicacion es: "+calcu1.multiplicacion(2,2));
           System.out.println("La division es: "+calcu1.division(2,2));
           System.out.println("El resultado de elevar es: "+calcu1.exponenciacion(24,2));
           System.out.println("La raiz es: "+calcu1.raiz(81));
           System.out.println("El porcentaje es: "+calcu1.porcentaje(10,7500));
    }
}
