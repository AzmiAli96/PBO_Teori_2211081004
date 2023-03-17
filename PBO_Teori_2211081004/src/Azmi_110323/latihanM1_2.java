/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Azmi_110323;
import java.util.Scanner;
/**
 *
 * @author nitro
 */
public class latihanM1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tiga bilangan bulat: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int gcf = 1;
        int smallest = Math.min(Math.min(num1, num2), num3);

        for (int i = 2; i <= smallest; i++) {
            if (num1 % i == 0 && num2 % i == 0 && num3 % i == 0) {
                gcf = i;
            }
        }

        System.out.println("GCF dari " + num1 + ", " + num2 + ", dan " + num3 + " adalah " + gcf + ".");
    }
}


