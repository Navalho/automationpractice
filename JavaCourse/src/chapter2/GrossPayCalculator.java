/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;

import java.util.Scanner;

/**
 *
 * @author support
 */
public class GrossPayCalculator {
    public static void main(String arg[]){
        
        // 1. Get the numbers of hours worked
        System.out.println("Enter the number of hours the employes worked.");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        
        // 2. Get the hourly pay hate
        System.out.println("Enter the employee's pay rate.");
        double rate = scanner.nextDouble();
        scanner.close();
        
        // 3. Multiply hours and pay rate
        double grossPay = hours * rate;
        
        // 4. Display result
        System.out.println(grossPay);
    }
}
