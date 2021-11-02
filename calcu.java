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
public class calcu {
        public  int  suma( int a,  int b){
        return a+b;
    }

    public  int  resta( int a,  int b){
        return a-b;
    }
    
    public  int  multiplicacion( int a,  int b){
        return a*b;
    }
    
    public  int  division( int a,  int b){
        return a/b;
    }
    public int exponenciacion(double numero,int potencia){
        double cuadrado = Math.pow(numero, potencia);
        int resultado = (int) cuadrado;
        return resultado;
    }
    public double raiz(int numero){
        double resultado = Math.sqrt(numero);
        return resultado;
    }
    public double porcentaje(double porcen,int cantidad){
        double porcentaje1 = (porcen * cantidad) / 100;
       return porcentaje1;
    }
}
