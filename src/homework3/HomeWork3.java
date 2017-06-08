/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sergey
 */
public class HomeWork3 {

     public static void drawStars() throws InterruptedException {
        // Cool ending of task with running asterisks
        char charDraw = '*';
        for (int i = 0; i < 40; i++) {
         System.out.print(charDraw);
         Thread.sleep(250);
        
        }
        System.out.println(charDraw);
        };
     
       
    public static void main(String[] args) throws InterruptedException {
        int firstValue = 0;
        int secondValue = 0;
        int tempValue1 = 0;
        int tempValue2 = 0;
        int tempValue3 = 0;
        int tempValue4 = 0;
        int result1 = 0;
        int result2 = 0;
        double percentValue = 0;
        double accountValue = 0;
        double bankTemp1 = 0;
        
        Scanner in = new Scanner(System.in); 
        System.out.println("Task 1");
        System.out.println("Move middle digits in two three-digits numbers");
        System.out.println("Please input three digits of first value");  
        firstValue = in.nextInt();  
        System.out.println("Please input three digits of second value");  
        secondValue = in.nextInt();  
        tempValue1 = ((firstValue / 100) * 100) + ((secondValue % 100 / 10 )*10) + (firstValue % 10);
        System.out.println(tempValue1);  
        tempValue2 = ((secondValue / 100) * 100) + ((firstValue % 100 / 10 )*10) + (secondValue % 10);
        System.out.println(tempValue2);  
        drawStars();
        
        System.out.println("Task 2");
        System.out.println("Count summ and substract of different digits");
        System.out.println("Please input four digits");  
        firstValue = in.nextInt();  
        result1 = (firstValue / 1000) + (firstValue / 10 % 10);
        result2 = (firstValue / 100 % 10) - (firstValue % 10);
        System.out.println("Sum of first and third digits are " + result1);
        System.out.println("Difference of second and fourth digits are " + result2);
        drawStars();
        
        System.out.println("Task 3 ");
        System.out.println("Extract middle digit from three-digits number");
        System.out.println("Please input three digits");  
        firstValue = in.nextInt();  
        result1 = ((firstValue / 100) * 10) + (firstValue % 10);
        System.out.println(result1);  
        drawStars();
        
        System.out.println("Task 4");
        System.out.println("Let's count amount of percents, which bank should pay monthly");
        System.out.println("Please input amount on account");  
        accountValue = in.nextDouble();  
        System.out.println("Please input percent rate");  
        percentValue = in.nextDouble();  
        bankTemp1 =  (accountValue / 100) * percentValue;
        System.out.println(bankTemp1);  
        
        drawStars();
        //
        
        
    }
    
}
