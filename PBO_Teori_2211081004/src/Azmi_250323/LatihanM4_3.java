/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Azmi_250323;

/**
 *
 * @author nitro
 */
public class LatihanM4_3 {
    public static void main (String[] args){
        int n1 = 10;
        int n2 = 23;
        int n3 = 5;
        
        int tbs = (n1>n2)?((n1>=n3)?n1:n3):((n2>n3)?n2:n3);
                
        System.out.println("number1 = " +n1);
        System.out.println("number2 = " +n2);
        System.out.println("number3 = " +n3);
        System.out.println("nilai tertinggi adalah  = " +tbs);
    }
}
